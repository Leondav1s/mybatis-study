import com.davis.dao.StudentMapper;
import com.davis.dao.TeacherMapper;
import com.davis.pojo.Student;
import com.davis.pojo.Teacher;
import com.davis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void getStudent() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudent();

        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
