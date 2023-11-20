package com.example.demo.service;

import com.example.demo.entity.Student;

public interface UserService<T> {

    void save(T user);
    T login(T user);

    void deleteById(Integer id);

    T getById(Integer id);

    T getByMail(String mail);

}
