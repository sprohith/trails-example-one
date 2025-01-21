package com.trails.cqrs.projections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MasterProjections {

	private final static Map<Class<?>, Set<Class<?>>> projections = new HashMap<>();

	private static Set<Class<?>> safeGet(Class<?> key) {

		if (projections.containsKey(key)) {
			return projections.get(key);
		}

		synchronized (MasterProjections.class) {
			if (!projections.containsKey(key))
				projections.put(key, new HashSet<>());
		}

		return safeGet(key);
	}

	public static void safePut(Class<?> key, Class<?> value) {
		safeGet(key).add(value);
	}
}
