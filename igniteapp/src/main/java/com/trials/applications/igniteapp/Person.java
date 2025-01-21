package com.trials.applications.igniteapp;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "person")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

	@EmbeddedId
	private PersonKey key;

	private double salary;

	
	public PersonKey getKey() {
		return key;
	}


	public void setKey(PersonKey key) {
		this.key = key;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Person [key=" + key + ", salary=" + salary + "]";
	}
}