package com.employee.tracker.beans;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "emptracker")
public class EmployeeTracker {
	
	@Id
	@Column(name="tracking_id")
	private int trackId;
	
	@Column(name="today_date")
	private String todayDate;
	
	@Column(name="tracker_day")
	private int trackerDay;
	
	@Column(name="total_hour")
	private int totalHour;
	
	@Column(name="learning_activity")
	private String learningActivity;
	
	@Column(name="assignment_activity")
	private String assignmentActivity;
	
	@Column(name="description")
	private String description;
	
	@Column(name="detail_description")
	private String detailDescription;
	
	@Column(name="area_to_improve")
	private String areaToImprove;
	
	@Column(name="progress_completion")
	private int progressCompletion;
	
	@Column(name="review_comments")
	private String reviewComments;
	
//	@Column(name="user_id")
//	private int userId;
//	
	@ManyToOne
    @JoinColumn(name = "user_id")
    private Employee employee;
	
	public EmployeeTracker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeTracker(int trackId, String todayDate, int trackerDay, int totalHour, String learningActivity,
			String assignmentActivity, String description, String detailDescription, String areaToImprove,
			int progressCompletion, String reviewComments, Employee employee) {
		super();
		this.trackId = trackId;
		this.todayDate = todayDate;
		this.trackerDay = trackerDay;
		this.totalHour = totalHour;
		this.learningActivity = learningActivity;
		this.assignmentActivity = assignmentActivity;
		this.description = description;
		this.detailDescription = detailDescription;
		this.areaToImprove = areaToImprove;
		this.progressCompletion = progressCompletion;
		this.reviewComments = reviewComments;
		this.employee = employee;
	}

	public int getTrackId() {
		return trackId;
	}

	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}

	public String getTodayDate() {
		return todayDate;
	}

	public void setTodayDate(String todayDate) {
		this.todayDate = todayDate;
	}

	public int getTrackerDay() {
		return trackerDay;
	}

	public void setTrackerDay(int trackerDay) {
		this.trackerDay = trackerDay;
	}

	public int getTotalHour() {
		return totalHour;
	}

	public void setTotalHour(int totalHour) {
		this.totalHour = totalHour;
	}

	public String getLearningActivity() {
		return learningActivity;
	}

	public void setLearningActivity(String learningActivity) {
		this.learningActivity = learningActivity;
	}

	public String getAssignmentActivity() {
		return assignmentActivity;
	}

	public void setAssignmentActivity(String assignmentActivity) {
		this.assignmentActivity = assignmentActivity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetailDescription() {
		return detailDescription;
	}

	public void setDetailDescription(String detailDescription) {
		this.detailDescription = detailDescription;
	}

	public String getAreaToImprove() {
		return areaToImprove;
	}

	public void setAreaToImprove(String areaToImprove) {
		this.areaToImprove = areaToImprove;
	}

	public int getProgressCompletion() {
		return progressCompletion;
	}

	public void setProgressCompletion(int progressCompletion) {
		this.progressCompletion = progressCompletion;
	}

	public String getReviewComments() {
		return reviewComments;
	}

	public void setReviewComments(String reviewComments) {
		this.reviewComments = reviewComments;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmployeeTracker [trackId=" + trackId + ", todayDate=" + todayDate + ", trackerDay=" + trackerDay
				+ ", totalHour=" + totalHour + ", learningActivity=" + learningActivity + ", assignmentActivity="
				+ assignmentActivity + ", description=" + description + ", detailDescription=" + detailDescription
				+ ", areaToImprove=" + areaToImprove + ", progressCompletion=" + progressCompletion
				+ ", reviewComments=" + reviewComments + ", employee=" + employee + "]";
	}
	
	
	
	
}
