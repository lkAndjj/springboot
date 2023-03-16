package com.example.demo.event;

import com.example.demo.domian.Student;
import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @Author JCccc
 * @Description
 * @Date 2020/10/12 9:08
 */


public class RechargeChangeEvent extends ApplicationEvent {
 
    private Integer giftActivityId;
 
    private Student user;
 
 
    public RechargeChangeEvent(Object source, Integer giftActivityId,Student user) {
        super(source);
        this.giftActivityId = giftActivityId;
        this.user = user;
    }


    public Integer getGiftActivityId() {
        return giftActivityId;
    }

    public void setGiftActivityId(Integer giftActivityId) {
        this.giftActivityId = giftActivityId;
    }

    public Student getUser() {
        return user;
    }

    public void setUser(Student user) {
        this.user = user;
    }
}