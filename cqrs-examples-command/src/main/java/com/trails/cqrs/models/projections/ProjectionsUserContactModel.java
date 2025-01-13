package com.trails.cqrs.models.projections;

import com.trails.cqrs.base.Projections;
import com.trails.cqrs.models.commands.UserContactModel;
import com.trails.cqrs.models.commands.UserCreationModel;

public class ProjectionsUserContactModel implements Projections<UserCreationModel, UserContactModel> {

	public UserContactModel get(UserCreationModel userCreationModel) {
		UserContactModel userContactModel = new UserContactModel();

		userContactModel.setId(userCreationModel.getId());
		userContactModel.setAddress(userCreationModel.getAddress());
		userContactModel.setEmail(userCreationModel.getEmail());
		userContactModel.setMobileNo(userCreationModel.getMobileNo());

		return userContactModel;
	}
}
