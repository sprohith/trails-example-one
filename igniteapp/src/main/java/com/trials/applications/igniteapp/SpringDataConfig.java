package com.trials.applications.igniteapp;

import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.springdata.repository.config.EnableIgniteRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableIgniteRepositories(basePackageClasses = PersonIgniteRepository.class)
public class SpringDataConfig {

	@Bean
	public Ignite igniteInstance() {
		IgniteConfiguration config = new IgniteConfiguration();

		CacheConfiguration cache = new CacheConfiguration("mycache");

		cache.setIndexedTypes(PersonKey.class, Person.class);
		config.setCacheConfiguration(cache);
		return Ignition.start(config);
	}
}