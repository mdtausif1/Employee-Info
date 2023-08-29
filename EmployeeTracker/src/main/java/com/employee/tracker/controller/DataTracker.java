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
import com.employee.tracker.beans.EmployeeTracker;
import com.employee.tracker.services.EmployeeService;
import com.employee.tracker.services.EmployeeTrackerService;

@CrossOrigin("*")
@RestController
@RequestMapping("/employeeData/")
public class DataTracker {

	@Autowired
	private EmployeeTrackerService employeeTrackerService;

	@GetMapping("/hello")
	public String hello() {
		System.out.println("Hello World");
		return "Hello World";
	}
	
	@GetMapping("/all")
	public List<EmployeeTracker> getAllEmployeeData() {
		return employeeTrackerService.getAllTrackingDetails();
	}
	
	@GetMapping("/{user-id}")
	public EmployeeTracker getEmployeeDetailsById(@PathVariable(value = "user-id") int userId) {
		return employeeTrackerService.getEmployeeDetailsById(userId);
	}
	
	@PostMapping("/update")
	public EmployeeTracker updateEmployee(@RequestBody EmployeeTracker e) {
		return employeeTrackerService.updateEmployeeFields(e.getEmployee().getUserId() ,e);
	}
}
