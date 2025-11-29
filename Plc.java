package com.vkoryakin.diplom.techresource.Entity;

import jakarta.persistence.*;

@Entity
public class Plc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name="name")
    String name;

    @Column(name="document")
    String document;

    public Long getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Brand getPlcBrand() {
        return plcBrand;
    }

    public void setPlcBrand(Brand plcBrand) {
        this.plcBrand = plcBrand;
    }

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand plcBrand;
}
