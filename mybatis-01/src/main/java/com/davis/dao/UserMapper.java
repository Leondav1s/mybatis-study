package com.davis.dao;

import com.davis.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    List<User> getUserList();

    //模糊查询
    List<User> getUserLike(String name);

    //根据ID查询用户
    User getUserByID(int id);

    //插入用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);

    //map addUser
    int addUser2(Map<String, Object> map);

    //map getUserByID2
    User getUserByID2(Map<String, Object> map);



}
//这是Java中的一个方法签名,表示:
//1. 方法名为getUserList
//2. 该方法返回一个List
//3. 返回的List中的元素类型为User对象
//- List表示返回一个java.util.List接口类型的对象
//        - <User>表示这个List里面可以存放User类型的对象
//        - User则是一个具体的类名
//        所以该方法返回一个包含User对象的List。
//        调用该方法时,可以得到一个List,然后通过遍历这个List来获取里面的所有User对象。