package nl.codebean.reactspringboot.services;


import lombok.Data;
import lombok.NoArgsConstructor;
import nl.codebean.reactspringboot.model.Topic;
import nl.codebean.reactspringboot.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public Topic topic;

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }



    public Topic getTopic(Long id, Topic topic) {
        topicRepository.findById(id);
        return topic;
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }
    public void updateTopic(String id, Topic topic){
        topicRepository.save(topic);

    }


    public void deleteTopic(String id) {
        deleteTopic(id);
    }

    public Topic getTopic(Long id) {
        return getTopic(id);
    }
}
