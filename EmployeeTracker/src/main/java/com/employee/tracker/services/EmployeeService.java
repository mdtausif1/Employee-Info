package com.employee.tracker.services;

import java.util.List;

import com.employee.tracker.beans.Employee;

public interface EmployeeService {
	Employee getEmployeeById(int userId);

	List<Employee> getAllEmployees();

	Employee createEmployee(Employee employee);

	Employee updateEmployee(int userId, Employee employee);
}
