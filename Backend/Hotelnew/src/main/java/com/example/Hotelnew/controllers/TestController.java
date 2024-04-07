package com.example.Hotelnew.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/get")
    public String demo(){
        System.out.println("Hi");
        return "Hello";
    }
}
