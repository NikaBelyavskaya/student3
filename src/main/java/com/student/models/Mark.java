package com.student.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "marks")
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mark_id;

    @Column
    @NonNull
    private Integer mark;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="student_id", referencedColumnName = "student_id")
    private Student student;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="term_id", referencedColumnName = "term_id")
    private Term term;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="discipline_id", referencedColumnName = "discipline_id")
    private Discipline discipline;

    public Long getMark_id() {
        return mark_id;
    }

    public void setMark_id(Long mark_id) {
        this.mark_id = mark_id;
    }

    @NonNull
    public Integer getMark() {
        return mark;
    }

    public void setMark(@NonNull Integer mark) {
        this.mark = mark;
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

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public Mark() {
    }

    public Mark(Long mark_id, @NonNull Integer mark, Student student, Term term, Discipline discipline) {
        this.mark_id = mark_id;
        this.mark = mark;
        this.student = student;
        this.term = term;
        this.discipline = discipline;
    }
}
