package org.techinfo.starter.springboot;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@GetMapping("/topic")
	public List<Topic> getAllTopic() {
		return topicService.getAllTopics();
	}
	
	@GetMapping("/topic/{id}")
	public Optional<Topic> getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@PostMapping("/topic")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
		
	}
	
	@PutMapping("/topic/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(id, topic);
		
	}
	
	@DeleteMapping("/topic/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
		
	}

}
