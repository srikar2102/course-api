package com.javabrains.course.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.javabrains.course.model.Topic;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(
			new Topic(1, "CS"),
			new Topic(2, "CE")
			);
	public List<Topic> getAllTopics(){
		return topics;
	}
	public Topic getTopic(String id) {
		int ID = Integer.parseInt(id);
		return topics.stream().filter(t -> (t.getTopicId()==ID)).findFirst().get();
	}
}
