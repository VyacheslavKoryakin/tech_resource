package com.vkoryakin.diplom.techresource.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name="name")
    String name;

    @OneToMany(mappedBy = "role")
    List<User> users;

}
