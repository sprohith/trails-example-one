package com.trails.cqrs.models.queries;

import com.trails.cqrs.base.Models;

public class UserDataInquiryModel implements Models {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;

	public UserDataInquiryModel(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "UserDataInquiryModel [id=" + id + "]";
	}
}
