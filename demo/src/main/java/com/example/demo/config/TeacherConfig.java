package com.example.demo.config;


import com.example.demo.domian.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TeacherConfig {

    @Bean
    public Student getStudent(){
        return  new Student();
    }
}
