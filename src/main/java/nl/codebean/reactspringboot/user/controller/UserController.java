package nl.codebean.reactspringboot.user.controller;

import nl.codebean.reactspringboot.user.model.User;
import nl.codebean.reactspringboot.user.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.addUser(user);

    }
    @PutMapping
    public void updateUser(@RequestBody User user, @PathVariable String id){
        userService.updateUser(id, user);

    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){
        userService.deleteUser(id);
    }
}

