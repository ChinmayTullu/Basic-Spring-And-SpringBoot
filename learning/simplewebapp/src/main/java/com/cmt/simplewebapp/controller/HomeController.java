package com.cmt.simplewebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String HelloWorld() {
        return "Hello World!";
    }

    @RequestMapping("/about")
    public String aboutMessage() {
        return "About Me!";
    }
}
