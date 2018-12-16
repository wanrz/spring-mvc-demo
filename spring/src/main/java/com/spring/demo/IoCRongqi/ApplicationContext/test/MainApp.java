package com.spring.demo.IoCRongqi.ApplicationContext.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.demo.HelloWorld.HelloWorld;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"D:/WORK2018/work-own/spring/src/main/resources/Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
	}
}
