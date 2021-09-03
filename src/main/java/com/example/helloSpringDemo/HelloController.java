package com.example.helloSpringDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello From Controller";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to GitHub Actions";
    }
}
