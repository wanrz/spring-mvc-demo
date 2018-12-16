package com.spring.demo.Annotation.Required;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private int id;
	private Integer age;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Required
	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		System.out.println("Age : " + age);
		return age;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		System.out.println("Name : " + name);
		return name;
	}

	public void spellCheck() {
		System.out.println("我是学生" + getName() + "，我不想说话");
	}

	public void printThrowException() {
		System.out.println("Exception raised");
//		throw new IllegalArgumentException();
		throw new NullPointerException();
	}
}
