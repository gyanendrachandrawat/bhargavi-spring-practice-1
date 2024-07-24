package com.example.bhargavi_spring_practice_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BhargaviSpringPractice1Application implements CommandLineRunner {

	@Autowired
	Example example;


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
