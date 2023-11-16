package com.davis.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private String name;
    private  int id;
    private List<Student> students;
}
