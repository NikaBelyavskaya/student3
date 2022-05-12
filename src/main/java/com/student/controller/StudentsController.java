package com.student.controller;

import com.student.models.Student;
import com.student.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class StudentsController {

//    @Autowired
//    private StudentRepository studentRepository;
//
//    @GetMapping("/blog")
//    public String blog (Model model){
//        Iterable<Student> students = studentRepository.findAll();
//        model.addAttribute("students", students);
//        return "blog";
//    }
}
