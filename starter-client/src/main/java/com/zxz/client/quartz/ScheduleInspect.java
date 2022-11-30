package com.zxz.client.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author zxz
 * @date 2022年11月30日 9:27
 */
@Component
public class ScheduleInspect {
    @Scheduled(cron = "0 */1 * * * ?")
    void testSchedule(){
        System.out.println("schedule......");
    }
}
