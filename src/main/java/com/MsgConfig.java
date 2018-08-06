package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.model.AlertMessage;

@Configuration
@Profile("test")
public class MsgConfig {

	@Bean
	public  AlertMessage getAlertMessage() {
		System.out.println("test..................@@@@@@@@@@........");
		return new AlertMessage();
	}
}
