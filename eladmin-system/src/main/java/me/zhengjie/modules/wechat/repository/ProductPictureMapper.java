package me.zhengjie.modules.wechat.repository;

import java.util.List;
import me.zhengjie.modules.wechat.entity.ProductPicture;
import me.zhengjie.modules.wechat.entity.ProductPictureExample;
import org.apache.ibatis.annotations.Param;

public interface ProductPictureMapper {
    long countByExample(ProductPictureExample example);

    int deleteByExample(ProductPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductPicture record);

    int insertSelective(ProductPicture record);

    List<ProductPicture> selectByExample(ProductPictureExample example);

    ProductPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductPicture record, @Param("example") ProductPictureExample example);

    int updateByExample(@Param("record") ProductPicture record, @Param("example") ProductPictureExample example);

    int updateByPrimaryKeySelective(ProductPicture record);

    int updateByPrimaryKey(ProductPicture record);
}