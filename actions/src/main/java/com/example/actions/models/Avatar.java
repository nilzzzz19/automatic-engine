package com.example.actions.models;

import java.util.Random;

public class Avatar {
	
	private static final String[] greetings= {"Hi","Hello","Namastey"}; 
	private final Random r = new Random();
	private String name;

	public Avatar(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String greet() {
		int i = r.nextInt(greetings.length);
		return greetings[i];
	}
	

}
