package com.zzq.job;

import org.springframework.stereotype.Component;

/**
 * @author zzq
 * @createTime 2018/3/15
 */
@Component
public class EndJob {
    public void execute(){
        System.out.println("A man arrived at the end of the road");
    }
}
