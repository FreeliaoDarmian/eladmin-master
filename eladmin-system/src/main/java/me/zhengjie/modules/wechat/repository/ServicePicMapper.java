package me.zhengjie.modules.wechat.repository;

import java.util.List;
import me.zhengjie.modules.wechat.entity.ServicePic;
import me.zhengjie.modules.wechat.entity.ServicePicExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ServicePicMapper {
    long countByExample(ServicePicExample example);

    int deleteByExample(ServicePicExample example);

    int deleteByPrimaryKey(Long servicePicId);

    int insert(ServicePic record);

    int insertSelective(ServicePic record);

    List<ServicePic> selectByExample(ServicePicExample example);

    ServicePic selectByPrimaryKey(Long servicePicId);

    int updateByExampleSelective(@Param("record") ServicePic record, @Param("example") ServicePicExample example);

    int updateByExample(@Param("record") ServicePic record, @Param("example") ServicePicExample example);

    int updateByPrimaryKeySelective(ServicePic record);

    int updateByPrimaryKey(ServicePic record);
}