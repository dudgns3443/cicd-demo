package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String testApi() {

        return "Hello World!";
    }
    @GetMapping("/health")
    public boolean healthCheckApi() {

        return true;
    }
}
