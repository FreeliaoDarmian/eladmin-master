package me.zhengjie.modules.wechat.repository;

import java.util.List;
import me.zhengjie.modules.wechat.entity.ProductModel;
import me.zhengjie.modules.wechat.entity.ProductModelExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductModelMapper {
    long countByExample(ProductModelExample example);

    int deleteByExample(ProductModelExample example);

    int deleteByPrimaryKey(Integer modelId);

    int insert(ProductModel record);

    int insertSelective(ProductModel record);

    List<ProductModel> selectByExample(ProductModelExample example);

    ProductModel selectByPrimaryKey(Integer modelId);

    int updateByExampleSelective(@Param("record") ProductModel record, @Param("example") ProductModelExample example);

    int updateByExample(@Param("record") ProductModel record, @Param("example") ProductModelExample example);

    int updateByPrimaryKeySelective(ProductModel record);

    int updateByPrimaryKey(ProductModel record);
}