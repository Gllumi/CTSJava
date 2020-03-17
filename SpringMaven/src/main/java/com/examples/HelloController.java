package com.examples;

public class HelloController {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HelloController() {
	
	}
	public void sayHello() {
		System.out.println("Hello"+name);
	}
	
}
