package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String testApi() {

        return "11회차 여러분 반갑습니다 배포 테스트입니다.";
    }
    @GetMapping("/health")
    public boolean healthCheckApi() {

        return true;
    }
}
