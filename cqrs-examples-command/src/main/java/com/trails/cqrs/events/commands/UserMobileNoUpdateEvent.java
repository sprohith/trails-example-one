package com.trails.cqrs.events.commands;

import com.trails.cqrs.base.Events;
import com.trails.cqrs.models.commands.UserMobileNoUpdateModel;

public class UserMobileNoUpdateEvent implements Events {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final UserMobileNoUpdateModel userMobileNoUpdateModel;

	public UserMobileNoUpdateEvent(UserMobileNoUpdateModel userMobileNoUpdateModel) {
		super();
		this.userMobileNoUpdateModel = userMobileNoUpdateModel;
	}

	@Override
	public String toString() {
		return "UserMobileNoUpdateEvent [userMobileNoUpdateModel=" + userMobileNoUpdateModel + "]";
	}
}
