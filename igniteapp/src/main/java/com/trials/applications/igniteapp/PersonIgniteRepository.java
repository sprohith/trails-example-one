package com.trials.applications.igniteapp;

import org.springframework.stereotype.Repository;
import org.apache.ignite.springdata.repository.IgniteRepository;
import org.apache.ignite.springdata.repository.config.RepositoryConfig;

@Repository
@RepositoryConfig(cacheName = "mycache")
public interface PersonIgniteRepository extends IgniteRepository<Person, PersonKey> {

	Person getPersonByKey(PersonKey key);
}