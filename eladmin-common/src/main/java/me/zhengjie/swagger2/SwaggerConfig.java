package me.zhengjie.swagger2;

import com.google.common.base.Predicates;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.ArrayList;
import java.util.List;

/**
 * api页面 /swagger-ui.html
 * @author Zheng Jie
 * @date 2018-11-23
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Value("${swagger.enable:true}")
    boolean enable;
    @Value("${swagger.title: API文档}")
    String title;
    @Value("${swagger.description: API文档}")
    String description;
    @Value("${swagger.contact.name:廖辉映}")
    String contactName;
    @Value("${swagger.contact.url:www.baidu.com}")
    String contactUrl;
    @Value("${swagger.contact.mail:无}")
    String contactMail;
    @Value("${swagger.version:1.0.0}")
    String version;

    @Value("${swagger.termsOfServiceUrl:http://localhost:8000/}")
    String termsOfServiceUrl;

    @Value("${jwt.header}")
    private String tokenHeader;


    @Bean
    public Docket createRestApi() {
        ParameterBuilder ticketPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>();
        ticketPar.name(tokenHeader).description("token")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .defaultValue("Bearer ")
                .required(true)
                .build();
        pars.add(ticketPar.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(enable)
                .apiInfo(apiInfo())
                .select()
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build()
                .globalOperationParameters(pars);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().
        title(this.title)
                .termsOfServiceUrl(termsOfServiceUrl)
                .description(this.description)
                .contact(new Contact(this.contactName, this.contactUrl, this.contactMail))
                .version(this.version)
                .termsOfServiceUrl(this.termsOfServiceUrl)
                .build();
    }

}
