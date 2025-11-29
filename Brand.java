package com.vkoryakin.diplom.techresource.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name="name")
    String name;

    @OneToMany(mappedBy = "driverBrand")
    private List<Driver> drivers;



    @OneToMany(mappedBy = "plcBrand")
    private List<Plc> plcs;


    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
