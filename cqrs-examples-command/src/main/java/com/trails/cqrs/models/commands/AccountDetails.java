package com.trails.cqrs.models.commands;

import java.io.Serializable;
import java.util.Map;

public class AccountDetails extends DetailsBasic {

	public AccountDetails(String id) {
		super(id);
	}
	
	public AccountDetails(String id, Map<String, Serializable> details) {
		super(id, details);
	}
}
