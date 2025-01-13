package com.trails.cqrs.models.commands;

import com.trails.cqrs.base.Models;

public class UserContactModel implements Models {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String address;
	private String email;
	private String mobileNo;

	public UserContactModel() {
	}
	
	// Constructor
	public UserContactModel(String id, String address, String email, String mobileNo) {
		this.id = id;
		this.address = address;
		this.email = email;
		this.mobileNo = mobileNo;
	}

	// Getter for id
	public String getId() {
		return id;
	}

	// Setter for id
	public void setId(String id) {
		this.id = id;
	}

	// Getter for address
	public String getAddress() {
		return address;
	}

	// Setter for address
	public void setAddress(String address) {
		this.address = address;
	}

	// Getter for email
	public String getEmail() {
		return email;
	}

	// Setter for email
	public void setEmail(String email) {
		this.email = email;
	}

	// Getter for mobileNo
	public String getMobileNo() {
		return mobileNo;
	}

	// Setter for mobileNo
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "UserContactModel{" + "id='" + id + '\'' + ", address='" + address + '\'' + ", email='" + email + '\''
				+ ", mobileNo='" + mobileNo + '\'' + '}';
	}
}
