package nl.codebean.reactspringboot.user.services;


import nl.codebean.reactspringboot.user.model.User;

import nl.codebean.reactspringboot.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User user;

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public User getUser(Long id, User user) {
        userRepository.findById(id);
        return user;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(String id, User user) {
        userRepository.save(user);

    }

    public void deleteUser(String id) {
        deleteUser(id);
    }

    public User getUser(Long id) {
        return getUser(id);
    }
}
