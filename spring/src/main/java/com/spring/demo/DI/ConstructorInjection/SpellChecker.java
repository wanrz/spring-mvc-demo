package com.spring.demo.DI.ConstructorInjection;

public class SpellChecker {
	public SpellChecker() {
		System.out.println("我是SpellChecker的构造器");
	}

	public void checkSpelling() {
		System.out.println("Inside checkSpelling.");
	}
}
