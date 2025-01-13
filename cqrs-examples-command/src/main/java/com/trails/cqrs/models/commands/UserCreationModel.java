package com.trails.cqrs.models.commands;

import com.trails.cqrs.base.Models;

public class UserCreationModel implements Models {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String dateOfBirth;
	
	private String address;
	private String email;
	private String mobileNo;
	
	public UserCreationModel() {
		super();
	}
	
	public UserCreationModel(String id, String name, String dateOfBirth, String address, String email,
			String mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.email = email;
		this.mobileNo = mobileNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "UserCreationModel [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", address="
				+ address + ", email=" + email + ", mobileNo=" + mobileNo + "]";
	}
}
