package nl.codebean.reactspringboot.topics.services;

import nl.codebean.reactspringboot.topics.model.Topic;
import nl.codebean.reactspringboot.topics.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public Topic topic;

    @Transactional
    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(Long id, Topic topic) {
        topicRepository.findById(id);
        return topic;
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);

    }

    public void deleteTopic(String id) {
        deleteTopic(id);
    }

    public Topic getTopic(Long id) {
        return getTopic(id);
    }
}
