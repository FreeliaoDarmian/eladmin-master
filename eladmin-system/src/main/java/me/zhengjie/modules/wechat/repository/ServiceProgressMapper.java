package me.zhengjie.modules.wechat.repository;

import java.util.List;
import me.zhengjie.modules.wechat.entity.ServiceProgress;
import me.zhengjie.modules.wechat.entity.ServiceProgressExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ServiceProgressMapper {
    long countByExample(ServiceProgressExample example);

    int deleteByExample(ServiceProgressExample example);

    int deleteByPrimaryKey(Long progressId);

    int insert(ServiceProgress record);

    int insertSelective(ServiceProgress record);

    List<ServiceProgress> selectByExample(ServiceProgressExample example);

    ServiceProgress selectByPrimaryKey(Long progressId);

    int updateByExampleSelective(@Param("record") ServiceProgress record, @Param("example") ServiceProgressExample example);

    int updateByExample(@Param("record") ServiceProgress record, @Param("example") ServiceProgressExample example);

    int updateByPrimaryKeySelective(ServiceProgress record);

    int updateByPrimaryKey(ServiceProgress record);
}