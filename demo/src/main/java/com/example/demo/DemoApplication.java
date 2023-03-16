package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import java.util.Map;

@SpringBootApplication

public class DemoApplication {

    public static void main(String[] args) {
       /* ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
        //applicationContext.getBean("test01");
        Map<String, Test01> beansOfType = applicationContext.getBeansOfType(Test01.class);
        System.out.println(beansOfType);*/


        SpringApplication.run(DemoApplication.class, args);
    }

}
