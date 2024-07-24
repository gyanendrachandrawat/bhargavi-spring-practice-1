package com.example.bhargavi_spring_practice_1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Example {

//    how to get values of a field from application.properties file
    @Value("${spring.application.name}")
    private String applicationName;

    public void printMessage() {
        System.out.println("Hello from Example");
    }

    public String getValueFromApplicationProperties() {
        return applicationName;
    }

}
