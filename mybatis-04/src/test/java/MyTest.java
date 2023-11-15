import com.davis.dao.UserMapper;
import com.davis.pojo.User;
import com.davis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userByID= mapper.getUserByID(1);
        System.out.println(userByID);
        sqlSession.close();
    }
}
