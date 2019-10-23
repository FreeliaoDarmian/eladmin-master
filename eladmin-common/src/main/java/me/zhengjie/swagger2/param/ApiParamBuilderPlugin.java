package me.zhengjie.swagger2.param;

import com.fasterxml.classmate.TypeResolver;
import com.google.common.base.Optional;
import javassist.*;
import javassist.bytecode.AnnotationsAttribute;
import javassist.bytecode.ConstPool;
import javassist.bytecode.annotation.Annotation;
import javassist.bytecode.annotation.BooleanMemberValue;
import javassist.bytecode.annotation.ClassMemberValue;
import javassist.bytecode.annotation.StringMemberValue;
import me.zhengjie.utils.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.Parameter;
import springfox.documentation.service.ResolvedMethodParameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.OperationModelsProviderPlugin;
import springfox.documentation.spi.service.ParameterBuilderPlugin;
import springfox.documentation.spi.service.contexts.ParameterContext;
import springfox.documentation.spi.service.contexts.RequestMappingContext;

import java.util.UUID;

@Component
@Order   //plugin加载顺序，默认是最后加载
public class ApiParamBuilderPlugin implements ParameterBuilderPlugin {
    @Autowired
    private TypeResolver typeResolver;

    @Override
    public void apply(ParameterContext parameterContext) {

        //System.out.println("ApiParamBuilderPlugin------------------------------");

        ResolvedMethodParameter methodParameter = parameterContext.resolvedMethodParameter();

        if (methodParameter.hasParameterAnnotation(ApiParamObject.class)) {
            Optional<ApiParamObject> optional = methodParameter.findAnnotation(ApiParamObject.class);  //根据参数上的ApiParamObject注解中的参数动态生成Class
            if (optional.isPresent()) {
                String name = parameterContext.getOperationContext().getGroupName().replace("-", "").replace("controller", "") + parameterContext.getOperationContext().getName() + optional.get().name();  //model 名称
                ApiParamProperty[] properties = optional.get().value();
                Class classz = optional.get().isBlack() ? updateRefModel(properties, name, methodParameter) : createRefModel(properties, name);
                parameterContext.getDocumentationContext().getAdditionalModels().add(typeResolver.resolve(classz));  //像documentContext的Models中添加我们新生成的Class
                Parameter body = parameterContext.parameterBuilder()  //修改Map参数的ModelRef为我们动态生成的class
                        .parameterType("body")
                        .modelRef(new ModelRef(name))
                        .name(optional.get().name())
                        .build();
                OperationModelsProviderPlugin operationModelsProviderPlugin = new OperationModelsProviderPlugin(){
                    @Override
                    public void apply(RequestMappingContext requestMappingContext) {
                       requestMappingContext.getParameters().add(methodParameter);
                    }

                    @Override
                    public boolean supports(DocumentationType documentationType) {
                        return true;
                    }
                };
            }
        }

    }

    /**
     * 黑名单模式
     *
     * @param properties
     * @param name
     * @param methodParameter
     * @return
     */
    private Class updateRefModel(ApiParamProperty[] properties, String name, ResolvedMethodParameter methodParameter) {
        ClassPool pool = ClassPool.getDefault();
        try {
            CtClass classz = pool.getCtClass(methodParameter.getParameterType().toString());
            classz.setName(basePackage + UUID.randomUUID().toString().replace("-", "") + "." + name);
            for (ApiParamProperty property : properties) {
                try {
                    classz.removeField(classz.getDeclaredField(property.key()));
                } catch (Exception e) {
                }
                try {
                    classz.removeMethod(classz.getDeclaredMethod("get" + toUpperCaseFirstOne(property.key())));
                } catch (Exception e) {
                }
                try {
                    classz.removeMethod(classz.getDeclaredMethod("set" + toUpperCaseFirstOne(property.key())));
                } catch (Exception e) {
                }
                try {
                    classz.removeMethod(classz.getDeclaredMethod("is" + toUpperCaseFirstOne(property.key())));
                } catch (Exception e) {
                }
            }
            return classz.toClass();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String toUpperCaseFirstOne(String s) {
        if (Character.isUpperCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
    }

    private final static String basePackage = "com.huayuan.swagger.model.";  //动态生成的Class名

    /**
     * 根据propertys中的值动态生成含有Swagger注解的javaBeen
     */
    private Class createRefModel(ApiParamProperty[] propertys, String name) {
        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = pool.makeClass(basePackage + "temp" + IdUtil.getId() + "." + name);

        try {
            for (ApiParamProperty property : propertys) {
                ctClass.addField(createField(property, ctClass));
            }
            return ctClass.toClass();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据property的值生成含有swagger apiModelProperty注解的属性
     */
    private CtField createField(ApiParamProperty property, CtClass ctClass) throws NotFoundException, CannotCompileException {
        CtField ctField = new CtField(getFieldType(property.type()), property.key(), ctClass);
        ctField.setModifiers(Modifier.PUBLIC);

        ConstPool constPool = ctClass.getClassFile().getConstPool();

        AnnotationsAttribute attr = new AnnotationsAttribute(constPool, AnnotationsAttribute.visibleTag);
        Annotation ann = new Annotation("io.swagger.annotations.ApiModelProperty", constPool);
        ann.addMemberValue("value", new StringMemberValue(property.description(), constPool));
        ann.addMemberValue("required", new BooleanMemberValue(property.required(), constPool));
        ann.addMemberValue("type", new ClassMemberValue(property.type().getName(), constPool));
        ann.addMemberValue("example", new StringMemberValue(property.example(), constPool));

        attr.addAnnotation(ann);
        ctField.getFieldInfo().addAttribute(attr);

        return ctField;
    }

    private CtClass getFieldType(Class<?> type) throws NotFoundException {
        CtClass fileType = ClassPool.getDefault().get(type.getName());
        return fileType;
    }

    @Override
    public boolean supports(DocumentationType delimiter) {
        return true;
    }
}

