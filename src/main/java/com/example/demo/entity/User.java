package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    Integer id;
    @Max(value = 20, message = "El usuario no puede ser mayor a 20 caracteres")
    String username;
    Boolean active;
    LocalDate expire;


}
