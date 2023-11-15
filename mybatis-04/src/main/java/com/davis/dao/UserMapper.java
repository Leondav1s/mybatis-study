package com.davis.dao;

import com.davis.pojo.User;
import lombok.Data;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select * from mybatis.user")
    List<User> getUserList();

    @Select("select * from mybatis.user where id= #{id}")
    User getUserByID(@Param("id") int id);  //,@Param("name") String name

    @Insert("insert into mybatis.user(id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);

    @Update("update mybatis.user set name=#{name}, pwd=#{password} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from mybatis.user where id=#{id}")
    int deleteUser(@Param("id") int id);

}

