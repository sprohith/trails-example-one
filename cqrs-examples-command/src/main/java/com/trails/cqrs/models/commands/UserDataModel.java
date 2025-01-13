package com.trails.cqrs.models.commands;

import com.trails.cqrs.base.Models;

public class UserDataModel implements Models {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private String dateOfBirth;

	// Constructor
	public UserDataModel() {
	}
	
	// Constructor
	public UserDataModel(String id, String name, String dateOfBirth) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	// Getter for id
	public String getId() {
		return id;
	}

	// Setter for id
	public void setId(String id) {
		this.id = id;
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Setter for name
	public void setName(String name) {
		this.name = name;
	}

	// Getter for dateOfBirth
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	// Setter for dateOfBirth
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Person{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", dateOfBirth='" + dateOfBirth + '\'' + '}';
	}
}
