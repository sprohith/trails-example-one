package com.trails.cqrs.models.commands;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public abstract class DetailsBasic {
	
	private String id;
	private final Map<String, Serializable> details;
	
	public DetailsBasic(String id) {
		this(id, new HashMap<>());
	}
	
	public DetailsBasic(String id, Map<String, Serializable> details) {
		this.id = id;
		this.details = details;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Map<String, Serializable> getDetails() {
		return details;
	}
	
	public Serializable addDetails(String key, Serializable value) {
		return details.put(key, value);
	}
}
