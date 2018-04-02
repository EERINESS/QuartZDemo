package com.zzq.job;

import com.zzq.entity.Animal;
import org.quartz.JobExecutionContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author zzq
 * @createTime 2018/3/15
 */
public class LeaveJob extends QuartzJobBean {
    private Animal animal;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) {
        System.out.println("FirstScheduledJob Executes");
        this.animal.printAnimalMessage();
    }
    public void setAnimal(Animal animal){
        this.animal = animal;
    }
}
