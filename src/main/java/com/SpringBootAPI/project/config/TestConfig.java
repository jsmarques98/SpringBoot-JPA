package com.SpringBootAPI.project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.SpringBootAPI.project.entities.User;
import com.SpringBootAPI.project.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria", "maria@gmail.com", "+351933123456", "123456");
        User u2 = new User(null, "Lucas", "lucas@gmail.com", "+351933123457", "123456");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
