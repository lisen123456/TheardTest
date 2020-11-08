package com.ls;

import java.util.Date;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    public String call() throws Exception {

        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + "线程执行时间：" + new Date().getTime() + "执行次数" + i);
        }
        return "MyCallable接口执行完成";
    }
}
