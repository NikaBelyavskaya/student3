package com.student.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name="education_form")
public class EducationForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long education_form_id;

    @Column
//    @NonNull
    private String form;

    public Long getEducation_form_id() {
        return education_form_id;
    }

    public void setEducation_form_id(Long education_form_id) {
        this.education_form_id = education_form_id;
    }

//    @NonNull
    public String getForm() {
        return form;
    }

    public void setForm(/*@NonNull*/ String form) {
        this.form = form;
    }

    public EducationForm() {
    }

    public EducationForm(Long education_form_id, /*@NonNull */String form) {
        this.education_form_id = education_form_id;
        this.form = form;
    }

}
