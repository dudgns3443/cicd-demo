package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String testApi() {

        return "자동 배포 테스트입니다. 수강생 여러분 새해복 많이받으세요";
    }
    @GetMapping("/health")
    public boolean healthCheckApi() {

        return true;
    }
}
