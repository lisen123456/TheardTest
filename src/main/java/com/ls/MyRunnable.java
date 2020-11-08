package com.ls;

import java.util.Date;

public class MyRunnable implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + "自定义线程类：" + new Date().getTime());
        }
    }
}
