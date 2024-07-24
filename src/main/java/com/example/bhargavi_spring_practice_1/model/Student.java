package com.example.bhargavi_spring_practice_1.model;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private Long id;

    private String studentName;

    private String studentFathersName;

    private Integer marks;

    public Student() {
    }

    public Student(Long id, String studentName, String studentFathersName, Integer marks) {
        this.id = id;
        this.studentName = studentName;
        this.studentFathersName = studentFathersName;
        this.marks = marks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentFathersName() {
        return studentFathersName;
    }

    public void setStudentFathersName(String studentFathersName) {
        this.studentFathersName = studentFathersName;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }
}
