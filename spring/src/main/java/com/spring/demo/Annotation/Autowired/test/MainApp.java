package com.spring.demo.Annotation.Autowired.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.Annotation.Autowired.Teacher;
import com.spring.demo.Annotation.Required.Student;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Teacher teacher = (Teacher) context.getBean("teacher");
		teacher.spellCheck();
	}
}
