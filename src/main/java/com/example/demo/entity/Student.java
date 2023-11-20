package com.example.demo.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

     String name;
     Integer age;
     Integer roleId;
     List<Integer> bookId;
     String mail;
     String password;


}
