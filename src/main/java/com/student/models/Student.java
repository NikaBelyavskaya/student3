package com.student.models;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long student_id;
    @Column
    private String first_name;
    @Column
    private Integer gender_id;
    @Column
    private String email;

    public Student(String name, Integer age, String country) {
        this.first_name = name;
        this.gender_id = age;
        this.email = country;
    }

    public Student() {
    }

    public Long getStudent_id() {
        return student_id;
    }
    public void setStudent_id(Long id) {
        this.student_id = id;
    }

    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String name) {
        this.first_name = name;
    }

    public Integer getGender_id() {
        return gender_id;
    }
    public void setGender_id(Integer age) {
        this.gender_id = age;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String country) {
        this.email = country;
    }
}
