package com.student.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name="countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long country_id;

    @Column
//    @NonNull
    private String name;

    public Country() {

    }

    public Long getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Long country_id) {
        this.country_id = country_id;
    }

//    @NonNull
    public String getName() {
        return name;
    }

    public void setName(/*@NonNull*/ String name) {
        this.name = name;
    }

    public Country(Long country_id,/* @NonNull*/ String name) {
        this.country_id = country_id;
        this.name = name;
    }
}
