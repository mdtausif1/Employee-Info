package com.employee.tracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.tracker.beans.EmployeeTracker;
import com.employee.tracker.dao.EmployeeTrackerDao;

@Service("employeeTrackerService")
public class EmployeeTrackerServiceImpl implements EmployeeTrackerService {

	@Autowired
	EmployeeTrackerDao employeeTrackerDao;
	
	public EmployeeTrackerDao getEmployeeTrackerDao() {
		return employeeTrackerDao;
	}

	public void setEmployeeTrackerDao(EmployeeTrackerDao employeeTrackerDao) {
		this.employeeTrackerDao = employeeTrackerDao;
	}

	@Override
	public EmployeeTracker getEmployeeDetailsById(int userId) {
		System.out.println("Inside Service Employee Tracker");
		return employeeTrackerDao.getEmployeeDetailsById(userId);
	}

	@Override
	public List<EmployeeTracker> getAllTrackingDetails() {
		System.out.println("Inside Service Employee Tracker");
		return employeeTrackerDao.getAllTrackingDetails();
	}

	@Override
	public EmployeeTracker updateEmployeeFields(int userId, EmployeeTracker employeeTracker) {
		System.out.println("Inside Service Employee Tracker");
		return employeeTrackerDao.updateEmployeeFields(userId, employeeTracker);
	}

}
