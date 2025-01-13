package com.trails.cqrs.models.projections;

import com.trails.cqrs.base.Projections;
import com.trails.cqrs.models.commands.UserCreationModel;
import com.trails.cqrs.models.commands.UserDataModel;

public class ProjectionsUserDataModel implements Projections<UserCreationModel, UserDataModel> {

	public UserDataModel get(UserCreationModel userCreationModel) {
		UserDataModel userDataModel = new UserDataModel();
		userDataModel.setId(userCreationModel.getId());
		userDataModel.setName(userCreationModel.getName());
		userDataModel.setDateOfBirth(userCreationModel.getDateOfBirth());
		
		return userDataModel;
	}
}
