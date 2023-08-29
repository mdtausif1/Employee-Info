package com.employee.tracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.employee.tracker.beans.Employee;


@Service
public class MailService {

	private JavaMailSender javaMailSender;

	@Autowired
	public MailService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	// once Id is generated user get mail with id number	
	public void sendEmailForConfirmation(Employee employee) throws MailException {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(employee.getEmail());
		mail.setSubject("You have been successfully registered with us.");
		mail.setText("You are successfully registered with id: " + employee.getUserId()
				+ ". Please keep this for further reference. Please ask your project lead to fill in further details.");
		javaMailSender.send(mail);
	}
}