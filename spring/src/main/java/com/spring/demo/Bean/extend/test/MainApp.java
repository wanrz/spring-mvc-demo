package com.spring.demo.Bean.extend.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.Bean.extend.HelloIndia;
import com.spring.demo.HelloWorld.HelloWorld;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		objA.getMessage();

		HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
		objB.getMessage();
		objB.getMessage1();
		objB.getMessage2();
	}
}
