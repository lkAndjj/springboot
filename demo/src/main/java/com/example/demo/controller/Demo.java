package com.example.demo.controller;


import com.example.demo.domian.Student;

import com.example.demo.service.RechargeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @Autowired

    private Student student;

    @Autowired
    private RechargeService rechargeService;





    @GetMapping("/hello")
    public void say() {

    }

    @GetMapping("/hello2")
    public void say2() {
        Student student1=new Student();
        student1.setPhone("222");
        rechargeService.recharge(1,student1);
    }
}
