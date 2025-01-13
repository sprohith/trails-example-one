package com.trails.cqrs.models.commands;

import com.trails.cqrs.base.Models;

public class UserEmailUpdateModel implements Models {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String email;
	
	public UserEmailUpdateModel(String id, String email) {
		super();
		this.id = id;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserEmailUpdateModel [id=" + id + ", email=" + email + "]";
	}
}
