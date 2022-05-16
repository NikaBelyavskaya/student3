package com.student.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "specializations")
public class Specialization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long specialization_id;

    @Column
//    @NonNull
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="faculty_id", referencedColumnName = "faculty_id")
    private Faculty faculty;

    public Long getSpecialization_id() {
        return specialization_id;
    }

    public void setSpecialization_id(Long specialization_id) {
        this.specialization_id = specialization_id;
    }

//    @NonNull
    public String getName() {
        return name;
    }

    public void setName(/*@NonNull */String name) {
        this.name = name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Specialization() {
    }

    public Specialization(Long specialization_id, /*@NonNull*/ String name, Faculty faculty) {
        this.specialization_id = specialization_id;
        this.name = name;
        this.faculty = faculty;
    }
}
