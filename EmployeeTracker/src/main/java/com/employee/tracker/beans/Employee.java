package com.employee.tracker.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="empinfo")
public class Employee {
	
	@Id
	@GeneratedValue(generator="user_id")
	@SequenceGenerator(name="user_id",sequenceName="USER_ID_SEQ",allocationSize=1)
	@Column(name="user_id")
	private int userId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="contact_no")
	private long contactNo;
	
	@Column(name="github_link")
	private String githubLink;
	
	public Employee() {
		super();
	}
	public Employee(int userId, String name, String email, long contactNo, String githubLink) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
		this.githubLink = githubLink;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getGithubLink() {
		return githubLink;
	}
	public void setGithubLink(String githubLink) {
		this.githubLink = githubLink;
	}
	
	@Override
	public String toString() {
		return "Employee [userId=" + userId + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo
				+ ", githubLink=" + githubLink + "]";
	}
	
}
