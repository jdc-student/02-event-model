package com.jdc.event;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class FrameworkLifeCycleListener implements ApplicationListener<ApplicationEvent>{

	public void onApplicationEvent(ApplicationEvent event) {
		var date = new Date(event.getTimestamp());
		var dateString = new SimpleDateFormat("yyyy/MM/dd HH:mm ss SSS").format(date);	
		
		System.out.println("Event is occured at %s".formatted(dateString));
	}

}
