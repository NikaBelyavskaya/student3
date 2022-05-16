package com.student.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="graduation_date")
public class GraduationDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long graduation_date_id;

    @Column
//    @NonNull
    private Date date;

    public Long getGraduation_date_id() {
        return graduation_date_id;
    }

    public void setGraduation_date_id(Long graduation_date_id) {
        this.graduation_date_id = graduation_date_id;
    }

//    @NonNull
    public Date getDate() {
        return date;
    }

    public void setDate(/*@NonNull*/ Date date) {
        this.date = date;
    }

    public GraduationDate() {
    }

    public GraduationDate(Long graduation_date_id,/* @NonNull*/ Date date) {
        this.graduation_date_id = graduation_date_id;
        this.date = date;
    }
}
