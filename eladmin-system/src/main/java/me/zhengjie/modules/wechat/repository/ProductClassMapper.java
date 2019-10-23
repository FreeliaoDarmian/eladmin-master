package me.zhengjie.modules.wechat.repository;

import java.util.List;
import me.zhengjie.modules.wechat.entity.ProductClass;
import me.zhengjie.modules.wechat.entity.ProductClassExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductClassMapper {
    long countByExample(ProductClassExample example);

    int deleteByExample(ProductClassExample example);

    int deleteByPrimaryKey(Integer classId);

    int insert(ProductClass record);

    int insertSelective(ProductClass record);

    List<ProductClass> selectByExample(ProductClassExample example);

    ProductClass selectByPrimaryKey(Integer classId);

    int updateByExampleSelective(@Param("record") ProductClass record, @Param("example") ProductClassExample example);

    int updateByExample(@Param("record") ProductClass record, @Param("example") ProductClassExample example);

    int updateByPrimaryKeySelective(ProductClass record);

    int updateByPrimaryKey(ProductClass record);
}