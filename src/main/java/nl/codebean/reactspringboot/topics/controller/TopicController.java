package nl.codebean.reactspringboot.topics.controller;

import nl.codebean.reactspringboot.Profile.model.Profile;
import nl.codebean.reactspringboot.topics.model.Topic;
import nl.codebean.reactspringboot.topics.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/topics")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping
    public List<Topic> getAllprofiles(){
        return topicService.getAllTopics();
    }

    @GetMapping("/{id}")
    public Topic getTopic(@PathVariable Long id){
        return topicService.getTopic(id);
    }

    @PostMapping
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);

    }
    @PutMapping
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id, topic);

    }
    @DeleteMapping("/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}

