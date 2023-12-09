package com.sagarrout.springschedulerdemo;

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.lang.management.ManagementFactory;

@Component
public class TestScheduler {

    @Scheduled(fixedDelay = 100000)
    @SchedulerLock(name = "testScheduler")
    public void testScheduler() throws InterruptedException {
        System.out.println("testScheduler() called");
        System.out.println(ManagementFactory.getRuntimeMXBean().getPid());
        Thread.sleep(100000);
    }
}
