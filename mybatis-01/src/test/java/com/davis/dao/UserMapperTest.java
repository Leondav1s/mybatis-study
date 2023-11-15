package com.davis.dao;

import com.davis.pojo.User;
import com.davis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    @Test
    public void test(){
        //第一步，获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行SQL
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();

        for(User user : userList){
            System.out.println(user);
        }

        //关闭sqlsession
        sqlSession.close();
    }


    @Test
    public void getUserByID(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByID(1);
        System.out.println(user);
        sqlSession.close();
    }

    //增删改需要提交事务
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        int res=userMapper.addUser(new User(7,"狂仙","1231233232"));
        if(res>0){
            System.out.println("插入成功！");
        }
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    //修改用户
    @Test
    public void updateUser(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        UserMapper  mapper=sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(5,"haha","12333123"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(4);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void addUser2(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map= new HashMap<String,Object>();
        map.put("userid","6");
        map.put("userName","kk");
        map.put("userPwd", "321123");
        mapper.addUser2(map);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getUserByID2(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("id2",6);
        map.put("name","kk");
        User mapper1= mapper.getUserByID2(map);
        System.out.println(mapper1);
        sqlSession.close();
    }

    @Test
    public void getUserLike(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        List<User> userList= mapper.getUserLike("狂");
        for(User user : userList){
            System.out.println(user);
        }

        //关闭sqlsession
        sqlSession.close();

    }


}
