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
        mapper.deleteUser(8);
        // mapper.updateUser(new User(8, "SDFES","33847"));
        // mapper.addUser(new User(8,"skudo","783749"));
        // User userByID= mapper.getUserByID(1);
        // System.out.println(userByID);
        sqlSession.close();
    }
}
