package com.SpringBootAPI.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.SpringBootAPI.project")
public class ProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }
}
