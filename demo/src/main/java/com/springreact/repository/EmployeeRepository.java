package com.springreact.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springreact.entity.Employee;

@Repository
public class EmployeeRepository {
	
	@Autowired
	JdbcTemplate jdbctemplate; 

	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList();
		
		employees.add(new Employee(10, "Bob", "Dylan", 90000.00));
		employees.add(new Employee(12, "Phil", "Heath", 150000.00));
		employees.add(new Employee(17, "Bill", "Clinton", 400000.00));
		employees.add(new Employee(24, "Jimmy", "Fallon", 2000000.00));
		employees.add(new Employee(39, "Dwight", "Howard", 200000.00));
		employees.add(new Employee(45, "Lebron", "James", 3000000.00));

		return employees;
	}
	
}
