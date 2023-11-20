package com.example.demo.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Author {

    String name;
    Integer age;
    Integer roleId;
    String mail;
    String password;
}
