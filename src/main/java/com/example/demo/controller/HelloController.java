package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String testApi() {
        return "데브코스 여러분들 환영합니다.\n 배포가 성공적이길 바랍니다.\n 여러분들의 개발자 입문을 환영합니다.";
    }
}
