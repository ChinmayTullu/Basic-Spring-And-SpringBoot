package com.cmt.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoappApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoappApplication.class, args);

        Dev obj=context.getBean(Dev.class);
        obj.build();
	}

}
