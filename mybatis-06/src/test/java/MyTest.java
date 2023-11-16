import com.davis.dao.TeacherMapper;
import com.davis.pojo.Teacher;
import com.davis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper teacherMapper=sqlSession.getMapper(TeacherMapper.class);
        Teacher  teachers=teacherMapper.getTeacher(1);
        System.out.println(teachers);

        sqlSession.close();
    }
}
