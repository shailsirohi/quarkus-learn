package org.learn.k8s.java.quarkus;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.learn.k8s.java.quarkus.json.Employee;

@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeResource {

	private Map<String, Employee> empMap = Collections.synchronizedMap(new HashMap<String, Employee>());
	
	public EmployeeResource() {
		super();
		empMap.put("Davis", new Employee("Davis", "Engineer", "Emp01"));
		empMap.put("Randy", new Employee("Randy", "Analyst", "Emp02"));
	}
	
	@GET
	public Map<String,Employee> list(){
		
		return empMap;
	}
	
	@GET
	public Map<String,Employee> add(Employee e){
		
		empMap.put(e.name, e);
		return empMap;
	}
	
	public Map<String, Employee> delete(Employee e){
		if(empMap.containsKey(e.name))
		{
			empMap.remove(e.name);
		}
		
		return empMap;
	}
	
	
}
