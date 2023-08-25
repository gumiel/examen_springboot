package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getId(Integer id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(Integer id, User user) {
        User userFound = userRepository.findById(id).orElseThrow();
        userFound.setUsername(user.getUsername());
        userFound.setActive(user.getActive());
        userFound.setExpire(user.getExpire());
        return userRepository.save(userFound);
    }

    @Override
    public void delete(Integer id) {
        User userFound = userRepository.findById(id).orElseThrow();
        userRepository.delete(userFound);
    }
}
