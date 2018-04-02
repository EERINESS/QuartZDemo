package com.zzq.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author zzq
 * @createTime 2018/3/15
 */
public class DynamicJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        System.out.println("The fairy tale says there will be a rainbow after the rain");
    }
}
