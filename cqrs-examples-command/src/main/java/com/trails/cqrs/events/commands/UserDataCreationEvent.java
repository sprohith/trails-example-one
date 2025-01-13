package com.trails.cqrs.events.commands;

import com.trails.cqrs.base.Events;
import com.trails.cqrs.models.commands.UserDataModel;

public class UserDataCreationEvent implements Events {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final UserDataModel userDataModel;

	public UserDataCreationEvent(UserDataModel userDataModel) {
		super();
		this.userDataModel = userDataModel;
	}

	public UserDataModel getUserDataModel() {
		return userDataModel;
	}

	@Override
	public String toString() {
		return "UserDataCreationEvent [userDataModel=" + userDataModel + "]";
	}
}
