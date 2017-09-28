package com.example.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@ResponseBody  // If no anno. Return String is treated as a .jsp file name
public class HelloWorldController {
	@RequestMapping("/")
	public String hello() {
		return "Hello World!";
	}
}
