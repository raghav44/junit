package com.test.junit;

public class GreetingImpl implements Greeting{

	public String greet(String name) {
		if(name == null) {
			throw new IllegalArgumentException();
		}
		return "Hello"+name;
	}
}
