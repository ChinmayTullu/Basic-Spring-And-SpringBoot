package com.cmt.firstapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String greet() {
        return "Hello World!";
    }
}
