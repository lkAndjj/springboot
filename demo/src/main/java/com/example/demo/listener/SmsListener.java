package com.example.demo.listener;

import com.example.demo.event.RechargeChangeEvent;
import com.example.demo.service.SmsService;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author JCccc
 * @Description
 * @Date 2020/10/12 9:08
 */
@Component

public class SmsListener implements SmsService, ApplicationListener<RechargeChangeEvent> {
    @Override
    public void sendSms(String phone) {
        System.out.println("发送短信 成功");
    }
 
    @Override
    public void onApplicationEvent(RechargeChangeEvent event) {
        System.out.println("-------------------------------");
        Integer giftActivityId = event.getGiftActivityId();
 
        System.out.println("参与礼包活动id "+giftActivityId+" ，处理短信相关业务 , 获取短信签名等。。。。");
 
        String phone = event.getUser().getPhone();
        sendSms(phone);
 
    }
}