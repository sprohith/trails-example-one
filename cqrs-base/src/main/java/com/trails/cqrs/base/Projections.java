package com.trails.cqrs.base;

public interface Projections<In, Out> {
	
	public Out get(In in);
	
}