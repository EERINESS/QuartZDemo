package com.zzq.job;

import org.springframework.stereotype.Component;

/**
 * @author zzq
 * @createTime 2018/3/15
 */
@Component
public class TestJob {
    public void run(){
        System.out.println("This is test job");
    }
}
