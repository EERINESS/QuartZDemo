package com.zzq.entity;

import org.springframework.stereotype.Component;

/**
 * @author zzq
 * @createTime 2018/3/15
 */
@Component("animal")
public class Animal {
    public void printAnimalMessage(){
        System.out.println("I am Animal.");
    }
}
