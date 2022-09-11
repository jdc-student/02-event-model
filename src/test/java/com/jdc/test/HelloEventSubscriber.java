package com.jdc.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HelloEventSubscriber {

	private static final String CONFIG = "com.jdc.event";

	@Test
	void test()
	{
		try(var context= new AnnotationConfigApplicationContext(CONFIG))
		{
			
		}
	}
}
