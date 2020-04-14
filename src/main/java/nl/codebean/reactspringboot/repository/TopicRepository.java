package nl.codebean.reactspringboot.repository;
import nl.codebean.reactspringboot.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Long> {

}

