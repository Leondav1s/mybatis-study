package com.davis.dao;

import com.davis.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select * from mybatis.user")
    List<User> getUserList();

    @Select("select * from mybatis.user where id= #{id}")
    User getUserByID(@Param("id") int id);  //,@Param("name") String name



}

