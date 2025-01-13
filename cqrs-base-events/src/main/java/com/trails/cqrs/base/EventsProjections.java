package com.trails.cqrs.base;

public interface EventsProjections extends Projections<Events, Events> {
	
	public Events get(Events event);

}
