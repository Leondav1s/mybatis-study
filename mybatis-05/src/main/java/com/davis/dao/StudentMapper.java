package com.davis.dao;

import com.davis.pojo.Student;
import com.davis.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    //查询所有的学生信息和对应的老师信息
    List<Student> getStudent();
}
