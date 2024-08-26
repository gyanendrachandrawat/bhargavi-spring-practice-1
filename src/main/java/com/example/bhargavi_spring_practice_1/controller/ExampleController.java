package com.example.bhargavi_spring_practice_1.controller;

import com.example.bhargavi_spring_practice_1.model.ExampleStudent;
import org.springframework.web.bind.annotation.*;

//@RestController is used for for building RESTful web services.
// It includes @Controller annotation (It tells the spring
// that the annotated class is responsible to handle HTTP/web request)
// and @ResponseBody annotation ( it tells spring that the return value will be added to HTTP/web response body
// after serialization(converting object into json or string).
@RestController

//    @RequestMapping : It maps the URL to a controller class or method. it allows you to define different method types:
//    (Get, put, post, delete)
//     "/student" means this class will handle the requests with this url pattern
@RequestMapping("/example")
public class ExampleController {

//    value and method are the attributes of @RequestMapping annotation
//    value : value = "/example/{input}" This specifies the URL pattern that the method will handle.
//    methos :
    @RequestMapping(value = "/path-variable-example/{name}/{password}", method = RequestMethod.GET)
    public String example(@PathVariable String name, @PathVariable String password) {
        return " Hello from StudentController, example(), received input : "+name +", "+password;
    }

//    @GetMapping : this annotation maps the URL to a controller method, indicates Get type of method will be handled
//    by this method
    @GetMapping("/request-param-example")
    public String getMappingExample(@RequestParam("username") String input) {
        return "Hello from StudentController, getMappingExample(), received input : "+input;
    }

    @PostMapping("/request-body-example")
    public ExampleStudent getStudentFromRequest(@RequestBody ExampleStudent exampleStudentInput) {
        ExampleStudent exampleStudentObj = exampleStudentInput;
        return exampleStudentObj;
    }

}
