package com.example.studentapp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "roles")
@Entity
public class Roles {

    @Id
    @GeneratedValue
    private Long id;

    private String role;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
