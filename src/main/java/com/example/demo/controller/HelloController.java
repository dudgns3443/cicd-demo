package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String testApi() {

        return "자동 배포 테스트입니다. 반가워요 수강생여러분 배포테스트 한번더 gogo ";
    }
    @GetMapping("/health")
    public boolean healthCheckApi() {

        return true;
    }
}
