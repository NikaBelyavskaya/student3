package com.student.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="passport_info")
public class PassportInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long passport_info_id;

    @Column
//    @NonNull
    private Date due_date;

    @Column
//    @NonNull
    private String number;

    public Long getPassport_info_id() {
        return passport_info_id;
    }

    public void setPassport_info_id(Long passport_info_id) {
        this.passport_info_id = passport_info_id;
    }

//    @NonNull
    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(/*@NonNull*/ Date due_date) {
        this.due_date = due_date;
    }

//    @NonNull
    public String getNumber() {
        return number;
    }

    public void setNumber/*(@NonNull*/ String number) {
        this.number = number;
    }

    public PassportInfo() {
    }

    public PassportInfo(Long passport_info_id, /*@NonNull*/ Date due_date, /*@NonNull*/ String number) {
        this.passport_info_id = passport_info_id;
        this.due_date = due_date;
        this.number = number;
    }

}
