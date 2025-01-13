package com.trails.cqrs.events.commands;

import com.trails.cqrs.base.Events;
import com.trails.cqrs.models.commands.UserEmailUpdateModel;

public class UserEmailUpdateEvent implements Events {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final UserEmailUpdateModel userEmailUpdateModel;

	public UserEmailUpdateEvent(UserEmailUpdateModel userEmailUpdateModel) {
		super();
		this.userEmailUpdateModel = userEmailUpdateModel;
	}

	@Override
	public String toString() {
		return "UserEmailUpdateEvent [userEmailUpdateModel=" + userEmailUpdateModel + "]";
	}
}
