package com.example.testapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {

    @GetMapping("/getHelloWorld")
    public String getHelloWorld(){
        return "Hello World From Heroku with owais!!!";
    }
}
