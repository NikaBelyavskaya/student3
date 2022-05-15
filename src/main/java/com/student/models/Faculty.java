package com.student.models;


import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "faculties")
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long faculty_id;

    @Column
    @NonNull
    private String name;

    public Long getFaculty_id() {
        return faculty_id;
    }

    public void setFaculty_id(Long faculty_id) {
        this.faculty_id = faculty_id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public Faculty() {
    }

    public Faculty(Long faculty_id, @NonNull String name) {
        this.faculty_id = faculty_id;
        this.name = name;
    }
}
