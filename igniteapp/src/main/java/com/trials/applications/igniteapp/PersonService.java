package com.trials.applications.igniteapp;


public interface PersonService {
    Person savePerson(Person person);
    Person getPerson(PersonKey key); 
}