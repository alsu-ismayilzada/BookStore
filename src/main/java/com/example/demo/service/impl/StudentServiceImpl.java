package com.example.demo.service.impl;

import com.example.demo.entity.Author;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements UserService<Student> {

    private final StudentRepository studentRepository;

    @Override
    public void save(Student student) {
      studentRepository.save(student);
    }

    @Override
    public Student login(Student student) {
      return studentRepository.login(student);
    }

    @Override
    public void deleteById(Integer id) {
       studentRepository.deleteById(id);
    }

    @Override
    public Student getById(Integer id) {
        return studentRepository.getById(id);
    }

    @Override
    public Student getByMail(String mail) {
        return studentRepository.getByMail(mail);
    }
}

