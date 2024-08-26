package com.example.bhargavi_spring_practice_1.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student_table")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roll_no;
    private String name;
    private Integer contact_no;

    private Integer age;
    private String school_name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getRoll_no() {
        return this.roll_no;
    }

    public void setRoll_no(Integer id) {
        this.roll_no = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getContact_no() {
        return this.contact_no;
    }
    public void setContact_no(Integer contact_no) {
        this.contact_no = contact_no;
    }
    public String getSchool_name () {
        return this.school_name;
    }
    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }
}
