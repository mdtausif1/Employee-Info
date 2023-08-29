package com.employee.tracker.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.tracker.beans.Employee;
import com.employee.tracker.beans.EmployeeTracker;
import com.employee.tracker.services.MailService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private MailService notificationService;
	
	@Override
	@Transactional
	public Employee getEmployeeById(int userId) {
		String sql = "Select emp from Employee emp where userId =: id";
		Query query = (Query) entityManager.createQuery(sql);
		query.setParameter("id", userId);
		Employee res = (Employee) query.getSingleResult();
		return res;
	}

	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		System.out.println("Inside Dao Employee");
		String sql = "select emp from Employee emp";
		Query query = (Query) entityManager.createQuery(sql);
		List<Employee> allEmployeesTrack = query.getResultList();
		return allEmployeesTrack;
	}

	@Override
	@Transactional
	public Employee createEmployee(Employee e) {
		System.out.println("inside dao");
		try {
			entityManager.persist(e);
			notificationService.sendEmailForConfirmation(e);
			System.out.println("added");
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		return e;
	}

	@Override
	@Transactional
	public Employee updateEmployee(int userId, Employee employee) {
		Employee existingEmployee = getEmployeeById(userId);
		existingEmployee.setName(employee.getName());
		existingEmployee.setEmail(employee.getEmail());
		existingEmployee.setContactNo(employee.getContactNo());
		existingEmployee.setGithubLink(employee.getGithubLink());
		try {
			entityManager.persist(existingEmployee);
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		return existingEmployee;
	}
}
