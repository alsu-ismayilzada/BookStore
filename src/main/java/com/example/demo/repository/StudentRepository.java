package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentRepository {

    void save(Student student);
    Student login(Student student);
    void deleteById(Integer id);
    Student getById(Integer id);
    Student getByMail(String mail);
}
