package com.spring.demo.JDBC.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.Annotation.Required.Student;
import com.spring.demo.JDBC.StudentDAO;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		// StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate)
		// context.getBean("studentJDBCTemplate1");
		StudentDAO studentJDBCTemplate = (StudentDAO) context.getBean("studentJDBCTemplate");
		System.out.println("------Records Creation--------");
		studentJDBCTemplate.create("Zara", 11);
		studentJDBCTemplate.create("Nuha", 2);
		studentJDBCTemplate.create("Ayan", 15);
		System.out.println("------Listing Multiple Records--------");
		List<Student> students = studentJDBCTemplate.listStudents();
		for (Student record : students) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.println(", Age : " + record.getAge());
		}
		System.out.println("----Updating Record with ID = 2 -----");
		studentJDBCTemplate.update(2, 20);
		System.out.println("----Listing Record with ID = 2 -----");
		Student student = studentJDBCTemplate.getStudent(2);
		System.out.print("ID : " + student.getId());
		System.out.print(", Name : " + student.getName());
		System.out.println(", Age : " + student.getAge());

		System.out.println("----Listing Record with ID = 1 -----");
		// Student student1 = studentJDBCTemplate.getStudent1(1);
		// System.out.print("ID : " + student1.getId());
		// System.out.print(", Name : " + student1.getName());
		// System.out.println(", Age : " + student1.getAge());
	}
}
