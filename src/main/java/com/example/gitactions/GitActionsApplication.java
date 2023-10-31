package com.example.gitactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitActionsApplication {
@GetMapping("/")
public String home(){
    return "hello from spring boot 3";
}


    public static void main(String[] args) {
        SpringApplication.run(GitActionsApplication.class, args);
    }

}
