package com.student.controller;

import com.student.models.Student;
import com.student.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@Controller
public class MainController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Home page");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About page");
        return "about";
    }

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public String students(Model model) {
        Iterable<Student> students = studentRepository.findAll();
        model.addAttribute("students", students);
        return "students";
    }

//    @GetMapping("/students/add")
//    public String studentsAdd(Model model){
//        return "students-add";
//    }
//
//    @PostMapping("/students/add")
//    public String studentsPostAdd(@RequestParam String name, @RequestParam String age, @RequestParam String country, Model model){
//        Student student = new Student(name, Integer.valueOf(age), country);
//        studentRepository.save(student);
//        return "redirect:/students";
//    }

    @GetMapping("/students/{id}")
    public String studentDetails(@PathVariable(value = "id") Long id, Model model) {
        if (!studentRepository.existsById(id)) {
            return "redirect:/students";
        }
        Optional<Student> student = studentRepository.findById(id);
        ArrayList<Student> studentsArray = new ArrayList<>();
        student.ifPresent(studentsArray::add);
        model.addAttribute("studentsArray", studentsArray);
        return "student-details";
    }

    @GetMapping("/students/{id}/edit")
    public String studentEdit(@PathVariable(value = "id") Long id, Model model) {
        if (!studentRepository.existsById(id)) {
            return "redirect:/students";
        }
        Optional<Student> student = studentRepository.findById(id);
        ArrayList<Student> studentsArray = new ArrayList<>();
        student.ifPresent(studentsArray::add);
        model.addAttribute("studentsArray", studentsArray);
        return "student-edit";
    }

    @PostMapping("/students/{id}/edit")
    public String studentsPostUpdate(@PathVariable(value = "id") Long id, //student_id?
                                     @RequestParam String first_name,
                                     @RequestParam String middle_name,
                                     @RequestParam String last_name,
                                     @RequestParam String first_name_eng,
                                     @RequestParam String middle_name_eng,
                                     @RequestParam String last_name_eng,
                                     //@RequestParam String birthday,
                                     @RequestParam String gender,
                                     @RequestParam String country,
                                     @RequestParam String educationForm,
                                     @RequestParam String passportNumber,
                                     //@RequestParam String passportDueDateString,
                                     //@RequestParam String admissionDateString,
                                     //@RequestParam String graduationDateString,
                                     //@RequestParam String isDeducted,
                                     @RequestParam String deductionInfo,
                                     @RequestParam String group,
                                     @RequestParam String phoneNumber,
                                     @RequestParam String email,
                                     @RequestParam String additionalInfo,
                                     Model model) throws Exception {
        Student student = studentRepository.findById(id).orElseThrow(Exception::new);
        student.setFirst_name(first_name);
        student.setMiddle_name(middle_name);
        student.setLast_name(last_name);
        student.setFirst_name_eng(first_name_eng);
        student.setLast_name_eng(last_name_eng);
        student.setMiddle_name_eng(middle_name_eng);
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //Date birthdayDate = (Date) formatter.parse(birthday);
        //student.setBirthday(birthdayDate);
        student.getGender().setName(gender);
        student.getCountry().setName(country);
        student.getEducationForm().setForm(educationForm);
        student.getPassportInfo().setNumber(passportNumber);
        //Date passportDueDate = (Date) formatter.parse(passportDueDateString);
        //student.getPassportInfo().setDue_date(passportDueDate);
        //Date admissionDate = (Date) formatter.parse(admissionDateString);
        //student.getAdmissionInfo().getAdmissionDate().setDate(admissionDate);
        //Date graduationDate = (Date) formatter.parse(graduationDateString);
        //student.getAdmissionInfo().getGraduationDate().setDate(graduationDate);
        //student.setIsDeducted(isDeducted);
        student.getGroup().setName(group);
        student.setEmail(email);
        student.setPhone_number(phoneNumber);
        student.setAdditional_info(additionalInfo);
        //student.setGender_id(Integer.valueOf(age));
        studentRepository.save(student);
        return "redirect:/students/{id}";
    }

    @PostMapping("/students/{id}/remove")
    public String studentsPostDelete(@PathVariable(value = "id") Long id, Model model) throws Exception {
        Student student = studentRepository.findById(id).orElseThrow(Exception::new);
        studentRepository.delete(student);
        return "redirect:/students";
    }
}
