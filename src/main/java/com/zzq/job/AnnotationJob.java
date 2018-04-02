package com.zzq.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author zzq
 * @createTime 2018/3/15
 */
@Component
public class AnnotationJob {
    @Scheduled(cron = "0/3 * * * * ?")
    public void execute(){
        System.out.println("Smile now");
    }
}
