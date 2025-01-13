package com.trails.cqrs.events.projections;

import com.trails.cqrs.base.Projections;
import com.trails.cqrs.events.commands.UserContactCreationEvent;
import com.trails.cqrs.events.commands.UserCreationEvent;
import com.trails.cqrs.models.commands.UserContactModel;
import com.trails.cqrs.models.projections.ProjectionsUserContactModel;

public class ProjectionsUserContactCreation implements Projections<UserCreationEvent, UserContactCreationEvent> {

	static {
		MasterProjections.safePut(UserCreationEvent.class, ProjectionsUserContactCreation.class);
	}

	@Override
	public UserContactCreationEvent get(UserCreationEvent in) {
		UserContactModel userContactModel = new ProjectionsUserContactModel().get(in.getUserCreationModel());
		UserContactCreationEvent userContactCreationEvent = new UserContactCreationEvent(userContactModel);

		return userContactCreationEvent;
	}
}
