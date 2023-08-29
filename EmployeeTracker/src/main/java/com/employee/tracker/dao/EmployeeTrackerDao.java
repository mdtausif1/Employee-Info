package com.employee.tracker.dao;

import java.util.List;

import com.employee.tracker.beans.EmployeeTracker;

public interface EmployeeTrackerDao {

	EmployeeTracker getEmployeeDetailsById(int userId);

	List<EmployeeTracker> getAllTrackingDetails();

//	Employee createEmployee(Employee employee);

	EmployeeTracker updateEmployeeFields(int userId, EmployeeTracker employeeTracker);
}
