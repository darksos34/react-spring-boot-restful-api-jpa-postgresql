package nl.codebean.reactspringboot.user.repository;


import nl.codebean.reactspringboot.user.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}

