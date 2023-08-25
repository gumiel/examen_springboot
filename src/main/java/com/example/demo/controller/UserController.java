package com.example.demo.controller;



import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    UserService userSevice;

    @GetMapping
    public ResponseEntity<?> getAll() {
        List<User> users = userSevice.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody User user) {
        User userCreated = userSevice.create(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id) {
        User user = userSevice.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@Valid @PathVariable Integer id, @RequestBody User user) {
        User userEdited = userSevice.update(id, user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userEdited);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        userSevice.delete(id);
        return ResponseEntity.ok().build();
    }

}
