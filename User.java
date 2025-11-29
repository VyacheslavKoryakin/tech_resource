package com.vkoryakin.diplom.techresource.Entity;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "first_name")
    String firstName;


    @Column(name = "second_name")
    String secondName;

    @Column(name = "phone")
    int phone;

  @ManyToOne
  @JoinColumn(name = "role_id")
  private Role role;
}
