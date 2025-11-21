package com.codingwithchitra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/hello")
    public String index() {
        return "Welcome to Spring Boot from Scratch!";
    }   

}
