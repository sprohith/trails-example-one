package com.trials.applications.igniteapp;

import org.apache.ignite.Ignite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	//@Autowired
	//private Ignite ignite;
	
	@Autowired
	private PersonIgniteRepository personIgniteRepository;
	
	@Override
	public Person savePerson(Person person) {
		personIgniteRepository.save(person.getKey(), person);
		return personRepository.save(person);
	}

	@Override
	public Person getPerson(PersonKey key) {
		Person person = personIgniteRepository.getPersonByKey(key);
		if(person != null)
			return person;
		
		System.out.println("Finding from DB");
		
		Person personEntity = personRepository.findByKey(key);
		// Map PersonEntity to Person (if needed)
		return personEntity != null
				? personEntity
				: null;
	}
}