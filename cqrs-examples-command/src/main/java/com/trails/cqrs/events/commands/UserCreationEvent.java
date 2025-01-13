package com.trails.cqrs.events.commands;

import com.trails.cqrs.base.Events;
import com.trails.cqrs.models.commands.UserCreationModel;

public class UserCreationEvent implements Events {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private final UserCreationModel userCreationModel;

	public UserCreationEvent(UserCreationModel userCreationModel) {
		super();
		this.userCreationModel = userCreationModel;
	}

	public UserCreationModel getUserCreationModel() {
		return userCreationModel;
	}

	@Override
	public String toString() {
		return "UserCreationEvent [userCreationModel=" + userCreationModel + "]";
	}
}
