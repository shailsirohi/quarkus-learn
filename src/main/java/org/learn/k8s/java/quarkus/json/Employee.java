package org.learn.k8s.java.quarkus.json;

public class Employee {

	public String name;
	public String role;
	public String id;
	
	public Employee(){
		super();
	}

	public Employee(String name, String role, String id) {
		super();
		this.name = name;
		this.role = role;
		this.id = id;
	}
	
}
