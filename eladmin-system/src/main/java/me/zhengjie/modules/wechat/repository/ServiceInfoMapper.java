package me.zhengjie.modules.wechat.repository;

import java.util.List;
import me.zhengjie.modules.wechat.entity.ServiceInfo;
import me.zhengjie.modules.wechat.entity.ServiceInfoExample;
import me.zhengjie.modules.wechat.vo.QuerryData;
import org.apache.ibatis.annotations.Param;

public interface ServiceInfoMapper {
    long countByExample(ServiceInfoExample example);

    int deleteByExample(ServiceInfoExample example);

    int deleteByPrimaryKey(String serviceId);

    int insert(ServiceInfo record);

    int insertSelective(ServiceInfo record);

    List<ServiceInfo> selectByExample(ServiceInfoExample example);

    ServiceInfo selectByPrimaryKey(String serviceId);

    int updateByExampleSelective(@Param("record") ServiceInfo record, @Param("example") ServiceInfoExample example);

    int updateByExample(@Param("record") ServiceInfo record, @Param("example") ServiceInfoExample example);

    int updateByPrimaryKeySelective(ServiceInfo record);

    int updateByPrimaryKey(ServiceInfo record);

    List<ServiceInfo> selectByQuerryDate(QuerryData querryData);
}