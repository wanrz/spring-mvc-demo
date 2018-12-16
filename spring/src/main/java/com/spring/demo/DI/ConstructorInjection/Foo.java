package com.spring.demo.DI.ConstructorInjection;

public class Foo {
	public Foo(int year, String name) {
		System.out.println("我是FOO的构造器,"+year+"年、姓名"+name);
	}
	
	public void checkSpelling() {
		System.out.println("Foo checkSpelling.");
	}
}
