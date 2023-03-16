package com.example.demo.domian;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



@Data
@ConfigurationProperties(prefix = "sjk")
public class Student {
    private String name;

    private  String phone;

    public String getEmail() {

        return "111";
    }
}
