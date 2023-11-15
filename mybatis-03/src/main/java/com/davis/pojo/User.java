package com.davis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

//实体类
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Alias("user")
public class User {

    private int id;
    private String name;
    private String password;

}