package com.example.demo.listener;

import com.example.demo.domian.Student;
import com.example.demo.event.RechargeChangeEvent;
import com.example.demo.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import static java.lang.Thread.sleep;

@Component
public class EmailListener implements EmailService, ApplicationListener<RechargeChangeEvent> {
    @Override
    public void sendEmail(String email) {
        System.out.println("发送邮件 成功");
    }

 
  
    @Override
    public void onApplicationEvent(RechargeChangeEvent event) {
        System.out.println("-------------------------------");
 
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Integer giftActivityId = event.getGiftActivityId();
        System.out.println("参与礼包活动id "+giftActivityId+" ，处理邮件相关业务 , 进行 A BC等。。。。");
        String email = event.getUser().getEmail();
        sendEmail(email);
 
    }
}