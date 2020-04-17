package com.smakash.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.smakash.springboot.model.Course;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;  
	
//	private List<Course> topics = new ArrayList<>(Arrays.asList(
//		new Course("Spring", "Spring Framework", "Spring Framework Description"),
//		new Course("JAVA", "JAVA Programming Language", "JAVA Description"),
//		new Course("JS", "JAVAScript Programming Language", "JS Description")
//	));
//	
	public List<Course> getAllCourses(String topicId){
		//return topics;
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findOne(id);
	}
	
	public void addCourse(Course course) {
		//topics.add(topic);
		courseRepository.save(course);
	}

	public void updateCourse(String id, Course course) {
		// TODO Auto-generated method stub
//		for(int i=0; i < topics.size(); i++) {
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		
		courseRepository.save(course);
	}

	public void deleteCourse(String id, Course course) {
		// TODO Auto-generated method stub
		//topics.removeIf(t -> t.getId().equals(id));
		courseRepository.delete(id);
	}
}
