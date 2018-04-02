package com.zzq.util;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author zzq
 * @createTime 2018/3/15
 */
public class SchedulerUtil {
    public static void modify(String jobName, String jobGroup, String triggerName, String triggerGroup, String cronExp){
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            JobDetail jobDetail = scheduler.getJobDetail(new JobKey(jobName, jobGroup));
            TriggerKey triggerKey = new TriggerKey(triggerName, triggerGroup);
            Trigger trigger = scheduler.getTrigger(triggerKey);
            TriggerBuilder triggerBuilder = trigger.getTriggerBuilder();
            triggerBuilder.withSchedule(CronScheduleBuilder.cronSchedule(cronExp));
            //根据任务调度器来取消任务调度
            scheduler.unscheduleJob(triggerKey);
            //以新的触发器规则来调度任务
            scheduler.scheduleJob(jobDetail, triggerBuilder.build());
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
