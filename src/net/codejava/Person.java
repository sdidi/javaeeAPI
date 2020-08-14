package net.codejava;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person implements Serializable {
	String name;
	String message;
	
	public Person() { 		
	}

	public Person(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String toString() {
		return "{\"name\":"+this.getName()+",\"message\":"+this.getMessage()+"!\"}";
	}

}
