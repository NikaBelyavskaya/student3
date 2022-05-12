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

import java.util.ArrayList;
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
    public String students(Model model){
        Iterable<Student> students = studentRepository.findAll();
        model.addAttribute("students", students);
        return "students";
    }

    @GetMapping("/students/add")
    public String studentsAdd(Model model){
        return "students-add";
    }

    @PostMapping("/students/add")
    public String studentsPostAdd(@RequestParam String name, @RequestParam String age, @RequestParam String country, Model model){
        Student student = new Student(name, Integer.valueOf(age), country);
        studentRepository.save(student);
        return "redirect:/students";
    }

    @GetMapping("/students/{id}")
    public String studentDetails(@PathVariable(value = "id") Long id, Model model){
        if (!studentRepository.existsById(id)){
            return "redirect:/students";
        }
        Optional<Student> student = studentRepository.findById(id);
        ArrayList<Student> studentsArray = new ArrayList<>();
        student.ifPresent(studentsArray::add);
        model.addAttribute("studentsArray", studentsArray);
        return "student-details";
    }

    @GetMapping("/students/{id}/edit")
    public String studentEdit(@PathVariable(value = "id") Long id, Model model){
        if (!studentRepository.existsById(id)){
            return "redirect:/students";
        }
        Optional<Student> student = studentRepository.findById(id);
        ArrayList<Student> studentsArray = new ArrayList<>();
        student.ifPresent(studentsArray::add);
        model.addAttribute("studentsArray", studentsArray);
        return "student-edit";
    }

    @PostMapping("/students/{id}/edit")
    public String studentsPostUpdate(@PathVariable(value = "id") Long id, @RequestParam String name, @RequestParam String age, @RequestParam String country, Model model) throws Exception {
        Student student = studentRepository.findById(id).orElseThrow(Exception::new);
        student.setName(name);
        student.setAge(Integer.valueOf(age));
        student.setCountry(country);
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
