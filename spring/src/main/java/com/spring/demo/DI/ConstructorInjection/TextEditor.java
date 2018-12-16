package com.spring.demo.DI.ConstructorInjection;

public class TextEditor {
	private SpellChecker spellChecker;
	
	private Foo foo;

	public TextEditor(SpellChecker spellChecker) {
		System.out.println("我是TextEditor的构造器");
		this.spellChecker = spellChecker;
	}
	
	public void setFoo(Foo foo) {
		this.foo = foo;
	}
	
	public Foo getFoo() {
		return foo;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
