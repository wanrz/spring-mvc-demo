package com.spring.demo.Annotation.Event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class CRefreshedEventHandler implements ApplicationListener<ContextRefreshedEvent> {
	
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("ContextRefreshedEvent Received");
	}

}
