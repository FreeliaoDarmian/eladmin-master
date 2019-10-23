package me.zhengjie.modules.wechat.repository;

import java.util.List;
import me.zhengjie.modules.wechat.entity.UserOwned;
import me.zhengjie.modules.wechat.entity.UserOwnedExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserOwnedMapper {
    long countByExample(UserOwnedExample example);

    int deleteByExample(UserOwnedExample example);

    int deleteByPrimaryKey(Integer userOwnedId);

    int insert(UserOwned record);

    int insertSelective(UserOwned record);

    List<UserOwned> selectByExample(UserOwnedExample example);

    UserOwned selectByPrimaryKey(Integer userOwnedId);

    int updateByExampleSelective(@Param("record") UserOwned record, @Param("example") UserOwnedExample example);

    int updateByExample(@Param("record") UserOwned record, @Param("example") UserOwnedExample example);

    int updateByPrimaryKeySelective(UserOwned record);

    int updateByPrimaryKey(UserOwned record);
}