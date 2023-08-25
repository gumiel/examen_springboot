package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User getById(Integer id);
    User create(User user);
    User update(Integer id, User user);
    void delete(Integer id);

}
