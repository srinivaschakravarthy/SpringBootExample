package com.example.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Import;


//opinion-based approach to load necessary beans
@EnableAutoConfiguration
@ComponentScan //Look in packages and subPackages
//@Import(value = {com.example.boot.controller.HelloWorldController.class}) //Can have an array of classes
public class ApplicationConfiguration {
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfiguration.class, args);
	}
}
