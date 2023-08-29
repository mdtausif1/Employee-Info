package com.employee.tracker.services;

import java.util.List;

import com.employee.tracker.beans.EmployeeTracker;

public interface EmployeeTrackerService {
	EmployeeTracker getEmployeeDetailsById(int userId);

	List<EmployeeTracker> getAllTrackingDetails();

//	Employee createEmployee(Employee employee);

	EmployeeTracker updateEmployeeFields(int userId, EmployeeTracker employeeTracker);

}
