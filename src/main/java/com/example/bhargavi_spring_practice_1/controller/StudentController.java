package com.example.bhargavi_spring_practice_1.controller;

import com.example.bhargavi_spring_practice_1.model.Student;
import com.example.bhargavi_spring_practice_1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student-controller")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/get-student-by-rollno")
    public Student getStudentByRollNo(Integer rollNo) {
        Student student = studentService.getStudentByRollNo(rollNo);
        return student;
    }

}
