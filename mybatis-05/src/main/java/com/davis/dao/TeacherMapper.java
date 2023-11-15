package com.davis.dao;

import com.davis.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {

    Teacher getTeacher(int id);
}
