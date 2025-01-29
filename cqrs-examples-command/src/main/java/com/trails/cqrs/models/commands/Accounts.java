package com.trails.cqrs.models.commands;

import java.io.Serializable;
import java.util.Map;

public class Accounts {

	private Map<String, AccountDetails> details;

	public Map<String, AccountDetails> getDetails() {
		return details;
	}

	public void setDetails(Map<String, AccountDetails> details) {
		this.details = details;
	}

	public AccountDetails addDetails(String type, AccountDetails acctDetails) {
		return this.details.put(type, acctDetails);
	}

	public void updateDetails(String id, String key, Serializable value) {
		this.details.values().stream().filter(x -> x.getDetails().containsKey(id))
				.forEach(y -> y.addDetails(key, value));
	}
}
