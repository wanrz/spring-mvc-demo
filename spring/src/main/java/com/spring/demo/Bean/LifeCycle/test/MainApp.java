package com.spring.demo.Bean.LifeCycle.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.Bean.LifeCycle.ExampleBean;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ExampleBean objA = (ExampleBean) context.getBean("exampleBean");
		objA.getMessage();
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}
