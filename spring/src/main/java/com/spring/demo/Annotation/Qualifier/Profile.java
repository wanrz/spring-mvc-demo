package com.spring.demo.Annotation.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring.demo.Annotation.Required.Student;

public class Profile {
	@Autowired
	@Qualifier("student2")
	private Student student;

	public Profile() {
		System.out.println("Inside Profile constructor.");
	}

	public void printAge() {
		System.out.println("Age : " + student.getAge());
	}

	public void printName() {
		System.out.println("Name : " + student.getName());
	}
}
