package com.SpringBootAPI.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootAPI.project.entities.User;


@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "João", "jmarques@gmail.com", "+351917077104", "test");
        return ResponseEntity.ok().body(u);
    }

}
