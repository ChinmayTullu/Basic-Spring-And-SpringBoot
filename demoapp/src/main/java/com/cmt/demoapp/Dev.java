package com.cmt.demoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    // Field Injection
    @Autowired 
    @Qualifier("desktop")
    private Computer comp;

    // Constructor Injection with @Qualifier
    // public Dev(@Qualifier("desktop") Computer comp) {
    //     this.comp = comp;
    // }

    // Setter Injection
    // @Autowired
    // @Qualifier("laptop")
    // public void setComp(Computer comp) {
    //     this.comp = comp;
    // }

    public void build() {
        comp.compile();
        System.out.println("I'm working on a Spring Boot project");
    }
}
