package com.student.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name="admission_info")
public class AdmissionInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long admission_info_id;

    @Column
    @NonNull
    private String order_number;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="admission_date_id", referencedColumnName = "admission_date_id")
    private AdmissionDate admissionDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="graduation_date_id", referencedColumnName = "graduation_date_id")
    private GraduationDate graduationDate;

    public Long getAdmission_info_id() {
        return admission_info_id;
    }

    public void setAdmission_info_id(Long admission_info_id) {
        this.admission_info_id = admission_info_id;
    }

    @NonNull
    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(@NonNull String order_number) {
        this.order_number = order_number;
    }

    public AdmissionDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(AdmissionDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public GraduationDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(GraduationDate graduationDate) {
        this.graduationDate = graduationDate;
    }

    public AdmissionInfo() {
    }

    public AdmissionInfo(Long admission_info_id, @NonNull String order_number, AdmissionDate admissionDate, GraduationDate graduationDate) {
        this.admission_info_id = admission_info_id;
        this.order_number = order_number;
        this.admissionDate = admissionDate;
        this.graduationDate = graduationDate;
    }
}
