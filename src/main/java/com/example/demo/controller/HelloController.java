package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String testApi() {
        return "서버 동작 테스트입니다~ 잘되었으면 좋겠네요 ";
    }
}
