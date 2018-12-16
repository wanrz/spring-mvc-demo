package com.spring.demo.Annotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.demo.Annotation.Required.Student;

public class Teacher {
	@Autowired
//	@Autowired(required=false)
	private Student student;

//	@Autowired
//	public void setStudent(Student student) {
//		this.student = student;
//	}
//
//	public Student getStudent() {
//		return student;
//	}
	
	public void spellCheck() {
		student.spellCheck();
	}
}
