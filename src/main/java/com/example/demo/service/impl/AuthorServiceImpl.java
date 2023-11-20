package com.example.demo.service.impl;

import com.example.demo.entity.Author;
import com.example.demo.entity.Student;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements UserService<Author>{

    private final AuthorRepository authorRepository;
    @Override
    public void save(Author author) {
        authorRepository.save(author);
    }

    @Override
    public Author login(Author author) {
        return authorRepository.login(author);
    }

    @Override
    public void deleteById(Integer id) {
        authorRepository.deleteById(id);
    }

    @Override
    public Author getById(Integer id) {
        return authorRepository.getById(id);
    }

    @Override
    public Author getByMail(String mail) {
        return authorRepository.getByMail(mail);
    }
}
