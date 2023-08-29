package com.employee.tracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.tracker.beans.Employee;
import com.employee.tracker.dao.EmployeeDao;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public Employee getEmployeeById(int userId) {
		System.out.println("Inside Service Employee");
		return employeeDao.getEmployeeById(userId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		System.out.println("Inside Service Employee");
		return employeeDao.getAllEmployees();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		System.out.println("Inside Service Employee");
		return employeeDao.createEmployee(employee);
	}

	@Override
	public Employee updateEmployee(int userId, Employee employee) {
		System.out.println("Inside Service Employee");
		return employeeDao.updateEmployee(userId, employee);
	}

}
