package com.trails.cqrs.events.commands;

import com.trails.cqrs.base.Events;
import com.trails.cqrs.models.commands.UserContactModel;

public class UserContactCreationEvent implements Events {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final UserContactModel userContactModel;

	public UserContactCreationEvent(UserContactModel userContactModel) {
		super();
		this.userContactModel = userContactModel;
	}
	
	public UserContactModel getUserContactModel() {
		return userContactModel;
	}

	@Override
	public String toString() {
		return "UserContactCreationEvent [userContactModel=" + userContactModel + "]";
	}
}
