package com.humber.assignment1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Hello from  Github";
    }
    @GetMapping("/mann")
    public String Mann() {
        return "Hello Mann from  Github";
    }
}
