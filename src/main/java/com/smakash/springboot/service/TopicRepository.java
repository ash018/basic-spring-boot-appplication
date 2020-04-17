package com.smakash.springboot.service;

import org.springframework.data.repository.CrudRepository;

import com.smakash.springboot.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

	Iterable<Topic> findAll();
	
	
	
}
