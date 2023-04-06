package org.techinfo.starter.springboot;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

//	Topic findOne(String id);
	
	//getAllTopics()
	//getTopic(Spring id)
	//updateTopic(Topic t)
	//deleteTopic(String id)

}
