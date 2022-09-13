package com.jdc.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.event.Message;
import com.jdc.event.service.User;
import com.jdc.event.service.UserRegistrationService;


public class HelloEventSubscriber {

	private static final String CONFIG = "com.jdc.event";

	@Test
	void test()
	{
		try(var context= new AnnotationConfigApplicationContext(CONFIG))
		{
//			context.scan(CONFIG);
//			context.refresh();
			//context.start();
			//.stop();
			
			//var message = new Message("Hello Message Payload");
			//var event = new PayloadApplicationEvent<Message>(CONFIG, message);
			//context.publishEvent(message);
			var user = new User();
			user.setName("Mg Seng");
			user.setEmail("seng@yandex.com");
			var service= context.getBean(UserRegistrationService.class);
			service.register(user);
			
		}
	}
}
