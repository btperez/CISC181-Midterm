package com.cisc181.core;

public class PersonException extends Exception{

	private Person humanoid;
	
	public PersonException() {
		super();
	}
	public PersonException(Person humanoid) {
		super();
		this.humanoid = humanoid;
	}
}

