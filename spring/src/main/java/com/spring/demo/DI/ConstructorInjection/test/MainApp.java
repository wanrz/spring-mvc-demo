package com.spring.demo.DI.ConstructorInjection.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.DI.ConstructorInjection.Foo;
import com.spring.demo.DI.ConstructorInjection.TextEditor;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//构造器注入   <constructor-arg ref="spellChecker" />
		TextEditor obj = (TextEditor) context.getBean("textEditor");
		obj.spellCheck();
		
		//Setter注入   <property name="foo" ref="foo"/>
		Foo foo = (Foo) context.getBean("foo");
		foo.checkSpelling();
	}
}
