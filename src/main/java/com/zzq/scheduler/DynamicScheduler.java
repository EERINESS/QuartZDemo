package com.zzq.scheduler;

import com.zzq.job.DynamicJob;
import com.zzq.util.SchedulerUtil;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author zzq
 * @createTime 2018/3/15
 */
public class DynamicScheduler {
    public static void main(String[] args) {
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            JobDetail jobDetail = JobBuilder.newJob(DynamicJob.class)
                    .withIdentity("rainbowJob", "jobGroup")
                    .build();
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("rainbowTrigger", "triggerGroup")
                    .withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ? *"))
                    .build();
            scheduler.start();
            scheduler.scheduleJob(jobDetail, trigger);
            Thread.sleep(10*1000);
            SchedulerUtil.modify("rainbowJob", "jobGroup", "rainbowTrigger", "triggerGroup", "0/3 * * * * ? *");
        } catch (SchedulerException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
