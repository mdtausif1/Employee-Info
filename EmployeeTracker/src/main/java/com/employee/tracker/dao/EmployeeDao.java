package com.employee.tracker.dao;

import java.util.List;

import com.employee.tracker.beans.Employee;

public interface EmployeeDao {
	Employee getEmployeeById(int userId);

	List<Employee> getAllEmployees();

	Employee createEmployee(Employee employee);

	Employee updateEmployee(int userId, Employee employee);
}
