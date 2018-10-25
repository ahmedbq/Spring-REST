package com.springreact.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springreact.entity.Employee;
import com.springreact.service.EmployeeService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*", allowedHeaders="*", methods={RequestMethod.POST})
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
}
