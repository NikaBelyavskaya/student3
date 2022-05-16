package com.student.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attendance_id;

    @Column
//    @NonNull
    private Integer skips_amount;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="student_id", referencedColumnName = "student_id")
    private Student student;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="term_id", referencedColumnName = "term_id")
    private Term term;

    public Long getAttendance_id() {
        return attendance_id;
    }

    public void setAttendance_id(Long attendance_id) {
        this.attendance_id = attendance_id;
    }

//    @NonNull
    public Integer getSkips_amount() {
        return skips_amount;
    }

    public void setSkips_amount(/*@NonNull*/ Integer skips_amount) {
        this.skips_amount = skips_amount;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public Attendance() {
    }

    public Attendance(Long attendance_id, /*@NonNull */Integer skips_amount, Student student, Term term) {
        this.attendance_id = attendance_id;
        this.skips_amount = skips_amount;
        this.student = student;
        this.term = term;
    }
}

