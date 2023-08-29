package com.employee.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.tracker.beans.Employee;
import com.employee.tracker.services.EmployeeService;

@CrossOrigin("*")
@RestController
@RequestMapping("/employee/")
public class Tracker {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/hello")
	public String hello() {
		System.out.println("Hello World");
		return "Hello World";
	}
	
	@GetMapping("/all")
	public List<Employee> getAllEmployeeData() {
		return employeeService.getAllEmployees();
	}
	
	@PostMapping("/add")
	public Employee createEmployee(@RequestBody Employee e) {
		return employeeService.createEmployee(e);
	}
	
	@GetMapping("/{user-id}")
	public Employee getEmployeeDetailsById(@PathVariable(value = "user-id") int userId) {
		return employeeService.getEmployeeById(userId);
	}
	
	@PostMapping("/update")
	public Employee updateEmployee(@RequestBody Employee e) {
		return employeeService.updateEmployee(e.getUserId(), e);
	}
}
