package com.example.demo.service.impl;


import com.example.demo.domian.Student;
import com.example.demo.event.RechargeChangeEvent;
import com.example.demo.service.RechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class RechargeServiceImpl implements RechargeService {
    @Autowired
    private ApplicationContext applicationContext;
 
    @Override
    public void recharge(Integer giftActivityId, Student user) {
        System.out.println("给用户"+user.getPhone() +"充值成功；使用的充值礼包系列id :"+giftActivityId);
        // 发布事件通知
        applicationContext.publishEvent(new RechargeChangeEvent(this,giftActivityId,user));
    }
}