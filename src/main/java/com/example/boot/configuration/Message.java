package com.example.boot.configuration;

//This is an external file. You are to assume that this is taken from somewhere.
public class Message {

	public Message() {
		super();
		System.out.println("New Message received.....");
	}

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		System.err.println("Setter method of Message called......");
		this.text = text;
	}
}
