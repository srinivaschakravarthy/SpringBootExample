package com.example.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot.MessageApp;
import com.example.boot.model.Person;

@RestController
@ResponseBody
@RequestMapping("/person")
public class PersonDetailsController {
	
	
	//This is not good. Only Autowire a service layer in a rest layer.
	//Follow 3 layer Architecture
	@Autowired
	private MessageApp messageObj;
	
	public void setMessageObj(MessageApp messageObj) {
		System.err.println("Setter method of messageApp called.......");
		this.messageObj = messageObj;
	}

	@RequestMapping("/string")
	public String getPersonDetails() {
		Person person = new Person(1, "John", "Miles", 998.09);
		return "Id: " + person.getId().toString() + " " + "Name: " + person.getFirstName() + " " + person.getLastName()
				+ " " + "Money: " + person.getMoney();
	}

	@RequestMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE, headers = "Accept=application/xml")
	public Person getPersonXML() {
		
		Person person = new Person(1, "John", "Miles", 998.09);
		return person;

	}
	
	@RequestMapping("/message")
	public String getMessage() {
		int i = messageObj.getMessageId();
		String str = messageObj.getMessage().getText();
		return "MessageID: " + i + " Message: " + str;
	}

}
