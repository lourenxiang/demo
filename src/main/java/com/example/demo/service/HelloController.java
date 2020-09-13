package com.example.demo.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/name")
    public String myName(){
        return "lourenxiang";
    }

    @GetMapping("/add-user")
    public String addUser(){
        return "add user";
    }


}
