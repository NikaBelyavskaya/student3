package com.student.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="admission_date")
    public class AdmissionDate {
    public Long getAdmission_date_id() {
        return admission_date_id;
    }

    public void setAdmission_date_id(Long admission_date_id) {
        this.admission_date_id = admission_date_id;
    }

//    @NonNull
    public Date getDate() {
        return date;
    }

    public void setDate(/*@NonNull*/ Date date) {
        this.date = date;
    }

    public AdmissionDate(Long admission_date_id,/* @NonNull*/ Date date) {
        this.admission_date_id = admission_date_id;
        this.date = date;
    }

    public AdmissionDate() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long admission_date_id;

    @Column
    /*@NonNull*/
    private Date date;
}
