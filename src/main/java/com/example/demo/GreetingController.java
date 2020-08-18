package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class GreetingController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello, Cloud Gate Academy Students";
    }
}