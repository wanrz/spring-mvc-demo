package com.spring.demo.Annotation.Event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class CClosedEventHandler implements ApplicationListener<ContextClosedEvent> {
	
	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("ContextClosedEvent Received");
	}

}
