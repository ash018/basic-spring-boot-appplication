package com.smakash.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.smakash.springboot.model.Topic;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;  
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
		new Topic("Spring", "Spring Framework", "Spring Framework Description"),
		new Topic("JAVA", "JAVA Programming Language", "JAVA Description"),
		new Topic("JS", "JAVAScript Programming Language", "JS Description")
	));
	
	public List<Topic> getAllTopics(){
		//return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}
	
	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
//		for(int i=0; i < topics.size(); i++) {
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		
		topicRepository.save(topic);
	}

	public void deleteTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		//topics.removeIf(t -> t.getId().equals(id));
		topicRepository.delete(id);
	}
}
