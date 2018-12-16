package com.spring.demo.Annotation.Event;

import org.springframework.context.ApplicationListener;
import org.springframework.web.context.support.RequestHandledEvent;

public class CRequestHandledEventHandler implements ApplicationListener<RequestHandledEvent> {
	
	public void onApplicationEvent(RequestHandledEvent event) {
		System.out.println("RequestHandledEvent Received");
	}

}
