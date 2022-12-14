package com.jdc.event.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class UserRegistrationService {

	@Autowired
	private ApplicationEventPublisher publish;
	
	public void register(User user) {
		System.out.println("Registration for %s is done!".formatted(user.getName()));
		publish.publishEvent(user);
	}
}
