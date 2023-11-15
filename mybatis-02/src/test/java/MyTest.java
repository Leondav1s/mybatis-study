import com.davis.dao.UserMapper;
import com.davis.pojo.User;
import com.davis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
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
}
