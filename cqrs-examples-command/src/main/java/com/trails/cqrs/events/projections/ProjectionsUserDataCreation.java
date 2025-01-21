package com.trails.cqrs.events.projections;

import com.trails.cqrs.base.Projections;
import com.trails.cqrs.events.commands.UserCreationEvent;
import com.trails.cqrs.events.commands.UserDataCreationEvent;
import com.trails.cqrs.models.commands.UserDataModel;
import com.trails.cqrs.models.projections.ProjectionsUserDataModel;
import com.trails.cqrs.projections.MasterProjections;

public class ProjectionsUserDataCreation implements Projections<UserCreationEvent, UserDataCreationEvent> {

	static {
		MasterProjections.safePut(UserCreationEvent.class, ProjectionsUserDataCreation.class);
	}
	
	@Override
	public UserDataCreationEvent get(UserCreationEvent in) {
		UserDataModel userDataModel = new ProjectionsUserDataModel().get(in.getUserCreationModel());
		UserDataCreationEvent userDataCreationEvent = new UserDataCreationEvent(userDataModel);
		
		return userDataCreationEvent;
	}
}
