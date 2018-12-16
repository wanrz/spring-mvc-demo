package com.spring.demo.Annotation.Qualifier.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.Annotation.Qualifier.Profile;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Profile profile = (Profile) context.getBean("profile");
		profile.printAge();
		profile.printName();
	}
}
