package com.trails.cqrs.models.commands;

import com.trails.cqrs.base.Models;

public class UserMobileNoUpdateModel implements Models {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String mobileNo;
	
	public UserMobileNoUpdateModel(String id, String mobileNo) {
		super();
		this.id = id;
		this.mobileNo = mobileNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "UserMobileNoUpdateModel [id=" + id + ", mobileNo=" + mobileNo + "]";
	}
}
