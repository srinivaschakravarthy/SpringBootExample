package com.example.boot.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//This class provides external beans to Spring Application container
//Pure Java Configurations
@Configuration
public class ExternalBeanConfiguration {
	
	@Value("${message.text}")
	private String str;
	
	@Bean
	public Message createMessage() {
		Message msg = new Message();
		//msg.setText("Message from External Bean ...");
		msg.setText(str);
		return msg;
	}
}
