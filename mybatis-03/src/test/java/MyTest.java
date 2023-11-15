import com.davis.dao.UserMapper;
import com.davis.pojo.User;
import com.davis.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


public class MyTest {

    static Logger logger = Logger.getLogger(MyTest.class);
    @Test
    public void test(){
        //第一步，获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行SQL
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        User user = userDao.getUserByID(3);
        System.out.println(user);

        //关闭sqlsession
        sqlSession.close();
    }

    @Test
    public void testLog4j(){
        logger.info("info:进入了testLog4j");
        logger.debug("debug:进入了testLog4j");
        logger.error("error:进入了testLog4j");
    }

    @Test
    public void getUserByLimit(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map=new HashMap<String, Integer>();
        map.put("startIndex",0);
        map.put("pageSize",2);

        List<User> userList= mapper.getUserLimit(map);
        for(User user:userList){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserByRowBound(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        RowBounds rowBounds=new RowBounds(1,2);
        List<User> userList=sqlSession.selectList("com.davis.dao.UserMapper.getUserRowBounds", null, rowBounds);
        for(User user: userList){
            System.out.println(user);
        }
        sqlSession.close();
    }
}
