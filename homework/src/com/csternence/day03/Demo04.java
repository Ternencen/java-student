package com.csternence.day03;

import java.util.concurrent.TimeUnit;

public class Demo04 {
    public static void main(String[] args) throws InterruptedException {
        // 堆内存一般为系统的1/4
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println(maxMemory / 1024 / 1024);

        // 让程序暂停执行100s
        TimeUnit.SECONDS.sleep(10);
    }
}
