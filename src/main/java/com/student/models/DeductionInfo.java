package com.student.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "deduction_info")
public class DeductionInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deduction_info_id;

    @Column
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

//    @NonNull
    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(/*@NonNull*/ String order_number) {
        this.order_number = order_number;
    }

    public Long getDeduction_info_id() {
        return deduction_info_id;
    }

    public void setDeduction_info_id(Long deduction_info_id) {
        this.deduction_info_id = deduction_info_id;
    }

    public DeductionInfo() {
    }

    public DeductionInfo(Long deduction_info_id, Date date, /*@NonNull*/ String order_number) {
        this.deduction_info_id = deduction_info_id;
        this.date = date;
        this.order_number = order_number;
    }

    @Column
//    @NonNull
    private String order_number;


}
