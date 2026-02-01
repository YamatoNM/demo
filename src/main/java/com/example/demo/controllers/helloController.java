package com.example.demo.controllers;

import com.example.demo.services.helloService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class helloController {
    private final helloService hs = new helloService();

    @GetMapping("/message")
    public String sayHello(){
       return hs.getMessage();
    }
}
