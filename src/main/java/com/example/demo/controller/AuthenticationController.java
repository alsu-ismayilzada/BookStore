package com.example.demo.controller;

import com.example.demo.entity.Author;
import com.example.demo.entity.Student;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class AuthenticationController {

    @Autowired
    private final UserService<Student> studentService;
    @Autowired
    private final UserService<Author> authorService;

    @PostMapping("/student/save")
    public void save(@RequestBody Student student){
        studentService.save(student);
    }
    @PostMapping("/author/save")
    public void save(@RequestBody Author author){
        authorService.save(author);
    }

    @PostMapping("/student/login")
    public ResponseEntity<?> login(@RequestBody Student student){
        Student student1 = studentService.login(student);
        return ResponseEntity.ok(student1);
    }

    @PostMapping("/authot/login")
    public ResponseEntity<?> login(@RequestBody Author author){
        Author author1 = authorService.login(author);
        return ResponseEntity.ok(author1);
    }

}
