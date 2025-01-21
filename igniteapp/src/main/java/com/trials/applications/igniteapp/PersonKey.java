package com.trials.applications.igniteapp;

import java.io.Serializable;
import java.util.Objects;

public class PersonKey implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;

	// Constructors, getters, setters, equals, and hashCode
	public PersonKey() {
	}

	public PersonKey(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		PersonKey personKey = (PersonKey) o;
		return age == personKey.age && Objects.equals(name, personKey.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public String toString() {
		return "PersonKey{" + "name='" + name + '\'' + ", age=" + age + '}';
	}
}