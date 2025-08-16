package com.cmt.demoapp;

import org.springframework.stereotype.Component;

@Component
// @Primary
public class Desktop implements Computer{
    public void compile() {
        System.out.println("Compiling as desktop....");
    }
}
