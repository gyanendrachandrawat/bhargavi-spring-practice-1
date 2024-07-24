package com.example.bhargavi_spring_practice_1.controller;

import com.example.bhargavi_spring_practice_1.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @RequestMapping(value = "/example/{input}", method = RequestMethod.GET)
    public String example(@PathVariable String input) {
        return " Hello from StudentController, example(), received input : "+input;
    }

    @GetMapping("/getMappingExample")
    public String getMappingExample(@RequestParam("inputString") String input) {
        return "Hello from StudentController, getMappingExample(), received input : "+input;
    }

    @GetMapping("/getStudentInput")
    public Student getStudentFromRequest(@RequestBody Student studentInput) {
        Student studentObj = studentInput;
        return studentObj;
    }

}
