package com.student.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name="terms")
public class Term {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long term_id;

    @Column
//    @NonNull
    private String number;

    public Long getTerm_id() {
        return term_id;
    }

    public void setTerm_id(Long term_id) {
        this.term_id = term_id;
    }

//    @NonNull
    public String getNumber() {
        return number;
    }

    public void setNumber(/*@NonNull*/ String number) {
        this.number = number;
    }

    public Term() {
    }

    public Term(Long term_id, /*@NonNull */String number) {
        this.term_id = term_id;
        this.number = number;
    }
}
