package com.spring.demo.Annotation.Event.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.Annotation.Qualifier.Profile;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		((ConfigurableApplicationContext) context).start();
//		((ConfigurableApplicationContext) context).refresh();
//		((ConfigurableApplicationContext) context).close();
		Profile profile = (Profile) context.getBean("profile");
		profile.printAge();
		profile.printName();
		((ConfigurableApplicationContext) context).stop();
	}
}
