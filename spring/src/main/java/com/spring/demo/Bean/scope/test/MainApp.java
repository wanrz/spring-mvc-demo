package com.spring.demo.Bean.scope.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.Bean.scope.ScopeWorld;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ScopeWorld objA = (ScopeWorld) context.getBean("scopeWorld");
		objA.setMessage("I'm object A");
		objA.getMessage();
		ScopeWorld objB = (ScopeWorld) context.getBean("scopeWorld");
		objB.getMessage();
	}
}
