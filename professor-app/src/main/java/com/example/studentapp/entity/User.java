package com.example.studentapp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Table(name = "user")
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    private String username;

    private String password;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private Set<Roles> roles;

}
