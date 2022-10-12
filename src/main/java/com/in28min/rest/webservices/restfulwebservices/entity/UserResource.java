package com.in28min.rest.webservices.restfulwebservices.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in28min.rest.webservices.restfulwebservices.dao.UserDaoService;

@RestController
public class UserResource {
    
    private UserDaoService service;
    
    @Autowired
    public UserResource(UserDaoService userDaoService) {
        this.service = userDaoService;
    }
    
    // GET "/users"
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return service.findAll();
    }
    
    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable int userId) {
        return service.findById(userId);
    }
    
    // the data we're sending is in the request body so we use @RequestBody
    @PostMapping("/users")
    public void createUser(@RequestBody User user) {
        
    }
    
}
