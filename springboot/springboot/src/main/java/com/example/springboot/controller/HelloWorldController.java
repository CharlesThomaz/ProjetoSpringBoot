package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello1")
    public String helloWorld1() {
        return "Olá, Mundo, sou o endpoint 'END1' de teste do Spring.";
    }

    @GetMapping("/hello2")
    public String helloWorld2() {
        return "Olá, Mundo, sou o endpoint 'END2' de teste do Spring.";
    }

    @GetMapping("/hello3")
    public String helloWorld3() {
        return "Olá, Mundo, sou o endpoint 'END3' de teste do Spring.";
    }
}

