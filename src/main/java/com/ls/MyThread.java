package com.ls;

import java.util.Date;

public class MyThread extends Thread{

    @Override
    public void run() {

        for (int i = 0; i < 10; i++){
            System.out.println("自定义线程类：" + new Date().getTime());
        }
    }
}
