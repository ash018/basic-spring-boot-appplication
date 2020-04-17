package com.smakash.springboot.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.smakash.springboot.model.Course;

public interface CourseRepository extends CrudRepository<Course, String> {

	Iterable<Course> findAll();
	public List<Course> findByName(String name);
	
	public List<Course> findByTopicId(String topicId);
	
}
