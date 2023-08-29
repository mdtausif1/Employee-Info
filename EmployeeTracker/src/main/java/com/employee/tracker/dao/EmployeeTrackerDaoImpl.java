package com.employee.tracker.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.tracker.beans.Employee;
import com.employee.tracker.beans.EmployeeTracker;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
public class EmployeeTrackerDaoImpl implements EmployeeTrackerDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public EmployeeTracker getEmployeeDetailsById(int userId) {
//		String sql = "Select empTrack from EmployeeTracker empTrack where Employee.userId =: id";
		String sql = "SELECT empTrack FROM EmployeeTracker empTrack WHERE empTrack.employee.userId = :id";
		Query query = (Query) entityManager.createQuery(sql);
		query.setParameter("id", userId);
		EmployeeTracker data = (EmployeeTracker) query.getSingleResult();
		return data;
	}

	@Override
	@Transactional
	public List<EmployeeTracker> getAllTrackingDetails() {
		String sql = "select emp from EmployeeTracker emp";
		Query query = (Query) entityManager.createQuery(sql);
		List<EmployeeTracker> allEmployeesTrack = query.getResultList();
		 return allEmployeesTrack;
	}

	@Override
	public EmployeeTracker updateEmployeeFields(int userId, EmployeeTracker employee) {
		EmployeeTracker existingEmployee = getEmployeeDetailsById(userId);
		existingEmployee.setTrackerDay(employee.getTrackerDay());
		existingEmployee.setTotalHour(employee.getTotalHour());
		existingEmployee.setLearningActivity(employee.getLearningActivity());
		existingEmployee.setAssignmentActivity(employee.getAssignmentActivity());
		existingEmployee.setDescription(employee.getDescription());
		existingEmployee.setDetailDescription(employee.getDetailDescription());
		existingEmployee.setAreaToImprove(employee.getAreaToImprove());
		existingEmployee.setProgressCompletion(employee.getProgressCompletion());
		existingEmployee.setReviewComments(employee.getReviewComments());
		try {
			entityManager.persist(existingEmployee);
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		return existingEmployee;
	}

}
