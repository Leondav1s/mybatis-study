package com.davis.dao;

import com.davis.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    List<User> getUserList();

    //根据ID查询用户
    User getUserByID(int id);

    //插入用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);

    List<User> getUserLimit(Map<String,Integer> map);

    List<User> getUserRowBounds();

}

