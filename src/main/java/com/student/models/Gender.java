package com.student.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name="gender")
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gender_id;

    @Column
//    @NonNull
    private String name;

    public Gender(Long gender_id,/* @NonNull*/ String name) {
        this.gender_id = gender_id;
        this.name = name;
    }

    public Gender() {

    }

    public Long getGender_id() {
        return gender_id;
    }

    public void setGender_id(Long gender_id) {
        this.gender_id = gender_id;
    }

//    @NonNull
    public String getName() {
        return name;
    }

    public void setName(/*@NonNull*/ String name) {
        this.name = name;
    }
}
