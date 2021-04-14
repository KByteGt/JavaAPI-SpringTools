package com.example.demo.model;

import java.util.ArrayList;

public class EmployeeList {

	private static ArrayList<Employee> list;
	
	public EmployeeList() {
		list = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee e) {
		list.add(e);
	}
	
	public ArrayList<Employee> get() {
		return list;
	}
}
