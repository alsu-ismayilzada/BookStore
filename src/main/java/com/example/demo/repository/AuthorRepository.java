package com.example.demo.repository;

import com.example.demo.entity.Author;
import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthorRepository {

    void save(Author author);
    Author login(Author author);
    void deleteById(Integer id);
    Author getById(Integer id);
    Author getByMail(String mail);
}
