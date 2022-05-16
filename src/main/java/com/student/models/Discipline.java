package com.student.models;


import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "disciplines")
public class Discipline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long discipline_id;

    public Long getDiscipline_id() {
        return discipline_id;
    }

    public void setDiscipline_id(Long discipline_id) {
        this.discipline_id = discipline_id;
    }

//    @NonNull
    public String getName() {
        return name;
    }

    public void setName(/*@NonNull*/ String name) {
        this.name = name;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public Discipline() {
    }

    public Discipline(Long discipline_id,/* @NonNull */String name, Specialization specialization) {
        this.discipline_id = discipline_id;
        this.name = name;
        this.specialization = specialization;
    }

    @Column
//    @NonNull
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="specialization_id", referencedColumnName = "specialization_id")
    private Specialization specialization;
}
