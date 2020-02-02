package com.bdcom.dao.mapper;

import com.bdcom.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    User selectByNamePass(@Param("username") String username, @Param("password")String password);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}