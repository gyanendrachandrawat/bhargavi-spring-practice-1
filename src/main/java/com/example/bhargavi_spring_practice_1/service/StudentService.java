package com.example.bhargavi_spring_practice_1.service;

import com.example.bhargavi_spring_practice_1.model.Student;
import com.example.bhargavi_spring_practice_1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student getStudentByRollNo(Integer rollNo) {
        Student student = studentRepository.findById(rollNo).orElseThrow();
        return student;
    }
}
