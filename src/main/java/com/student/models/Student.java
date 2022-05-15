package com.student.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long student_id;

    public  Student(Long student_id, String first_name, String middle_name, String last_name, String first_name_eng, String middle_name_eng, String last_name_eng, Date birthday, Gender gender, Country country, EducationForm educationForm, PassportInfo passportInfo, AdmissionInfo admissionInfo, Boolean isDeducted, DeductionInfo deductionInfo, Group group, String phone_number, String email, String additional_info) {
        this.student_id = student_id;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.first_name_eng = first_name_eng;
        this.middle_name_eng = middle_name_eng;
        this.last_name_eng = last_name_eng;
        this.birthday = birthday;
        this.gender = gender;
        this.country = country;
        this.educationForm = educationForm;
        this.passportInfo = passportInfo;
        this.admissionInfo = admissionInfo;
        this.isDeducted = isDeducted;
        this.deductionInfo = deductionInfo;
        this.group = group;
        this.phone_number = phone_number;
        this.email = email;
        this.additional_info = additional_info;
    }

    @Column
    private String first_name;
    @Column
    private String middle_name;
    @Column
    private String last_name;
    @Column
    private String first_name_eng;
    @Column
    private String middle_name_eng;
    @Column
    private String last_name_eng;
    @Column
    private Date birthday;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gender_id", referencedColumnName = "gender_id")
    private Gender gender;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    private Country country;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "education_form_id", referencedColumnName = "education_form_id")
    private EducationForm educationForm;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passport_info_id", referencedColumnName = "passport_info_id")
    private PassportInfo passportInfo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "admission_info_id", referencedColumnName = "admission_info_id")
    private AdmissionInfo admissionInfo;

    @Column //уточнить название или сделать снейк-стайлом
    private Boolean isDeducted;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "deduction_info_id", referencedColumnName = "deduction_info_id")
    private DeductionInfo deductionInfo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id", referencedColumnName = "group_id")
    private Group group;

    @Column
    private String phone_number;

    @Column
    private String email;

    @Column
    private String additional_info;

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name_eng() {
        return first_name_eng;
    }

    public void setFirst_name_eng(String first_name_eng) {
        this.first_name_eng = first_name_eng;
    }

    public String getMiddle_name_eng() {
        return middle_name_eng;
    }

    public void setMiddle_name_eng(String middle_name_eng) {
        this.middle_name_eng = middle_name_eng;
    }

    public String getLast_name_eng() {
        return last_name_eng;
    }

    public void setLast_name_eng(String last_name_eng) {
        this.last_name_eng = last_name_eng;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public EducationForm getEducationForm() {
        return educationForm;
    }

    public void setEducationForm(EducationForm educationForm) {
        this.educationForm = educationForm;
    }

    public PassportInfo getPassportInfo() {
        return passportInfo;
    }

    public void setPassportInfo(PassportInfo passportInfo) {
        this.passportInfo = passportInfo;
    }

    public AdmissionInfo getAdmissionInfo() {
        return admissionInfo;
    }

    public void setAdmissionInfo(AdmissionInfo admissionInfo) {
        this.admissionInfo = admissionInfo;
    }

    public Boolean getDeducted() {
        return isDeducted;
    }

    public void setDeducted(Boolean deducted) {
        isDeducted = deducted;
    }

    public DeductionInfo getDeductionInfo() {
        return deductionInfo;
    }

    public void setDeductionInfo(DeductionInfo deductionInfo) {
        this.deductionInfo = deductionInfo;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdditional_info() {
        return additional_info;
    }

    public void setAdditional_info(String additional_info) {
        this.additional_info = additional_info;
    }

    public Student() {
    }
}
