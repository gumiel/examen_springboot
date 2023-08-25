package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Entity
@Table(name = "user")
@NoArgsConstructor
public class User {
    @Id
    Integer id;
    String username;
    Boolean active;
    LocalDate expire;

}
