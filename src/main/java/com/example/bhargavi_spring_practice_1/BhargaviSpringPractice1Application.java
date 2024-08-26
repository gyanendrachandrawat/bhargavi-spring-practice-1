package com.example.bhargavi_spring_practice_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication: ye annotation main class mein use krte hai ..it enables auto-configuration and
// component scanning. It includes major annotation in itself they are:
//     	@EnableAutoConfiguration: as the name ...it enables autoconfiguration mechanism,
//     	Spring Boot auto-configuration automatically sets up your Spring application by using the
//     	jar files you've added.
//		@ComponentScan: it tells spring to scan current package and all of its sub-packages for classes
//		annotated with @component to register the beans of all these classes for spring to manage.
//

@SpringBootApplication
public class BhargaviSpringPractice1Application implements CommandLineRunner {

	@Autowired
	Example example;

//main method : when we run our code this method will be the first to execute.
	public static void main(String... args) {
		SpringApplication.run(BhargaviSpringPractice1Application.class, args);
		System.out.println("hello from main method");
	}

//	run(String... args) method of CommandLineRunner interface,
//	used to call a non static data member or method at the start of project execution
	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello from run method");
		example.printMessage();
		System.out.println(example.getValueFromApplicationProperties());
	}
}
