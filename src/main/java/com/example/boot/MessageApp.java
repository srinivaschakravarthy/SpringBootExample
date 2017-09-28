package com.example.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.boot.configuration.Message;

@Component
public class MessageApp {
	
	private int messageId;
	
	@Autowired    // Setter Injection - DI technique
	private Message message;

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	
	
	/*@Autowired
	public MessageApp(Message msg) {
		this.message = msg;
	}*/

}
