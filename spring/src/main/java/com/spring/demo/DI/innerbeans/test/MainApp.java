package com.spring.demo.DI.innerbeans.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.DI.innerbeans.FileEditor;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		FileEditor obj = (FileEditor) context.getBean("fileEditor");
		obj.fileCheck();
	}
}
