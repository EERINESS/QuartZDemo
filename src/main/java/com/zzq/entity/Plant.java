package com.zzq.entity;

import org.springframework.stereotype.Component;

/**
 * @author zzq
 * @createTime 2018/3/15
 */
@Component("plant")
public class Plant {
    public void printMessage() {
        System.out.println("Plants also have life.");
    }
}
