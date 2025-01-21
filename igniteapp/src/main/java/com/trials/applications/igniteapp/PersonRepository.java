package com.trials.applications.igniteapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, PersonKey> {

	Person findByKey(PersonKey personKey);
}