package com.infodoc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctors")
public class Doctor {
	private String licenseNo;
	private String firstName;
	private String lastName;
	private String openHours;
	private String closeHours;
	private String phNo;
	private String email;
	private String dept;
	private double fees;
	public Doctor() {
	}
	
	

	public Doctor(String licenseNo, String firstName, String lastName, String openHours, String closeHours,
			String phNo, String email, String dept, double fees) {
		super();
		this.licenseNo = licenseNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.openHours = openHours;
		this.closeHours = closeHours;
		this.phNo = phNo;
		this.email = email;
		this.dept = dept;
		this.fees = fees;
	}



	@Id
	@Column(name="license_no",nullable = false)
	public String getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	@Column(name="first_name",nullable = false)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(name="last_name",nullable = false)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Column(name="open_hours")
	public String getOpenHours() {
		return openHours;
	}
	public void setOpenHours(String openHours) {
		this.openHours = openHours;
	}
	@Column(name="close_hours")
	public String getCloseHours() {
		return closeHours;
	}
	public void setCloseHours(String closeHours) {
		this.closeHours = closeHours;
	}
	
	@Column(name="fees",nullable = false)
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}

    @Column(name = "ph_no",nullable = false)
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}


	@Column(name = "email",nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "department")
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

}
