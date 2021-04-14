package com.example.demo.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeList;

@Repository
public class EmployeeDAO {

	@Autowired
	//private static EmployeeList list;
	private static EmployeeList list = new EmployeeList();
	
	public void addEmployee(Employee e) {
		list.addEmployee(e);
	}
	
	public ArrayList<Employee> getEmployees() {
		if(this.list == null) return null;
		return list.get();
	}
}
