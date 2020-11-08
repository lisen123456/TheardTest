package com.ls;

import com.sun.corba.se.impl.orbutil.closure.Future;

import java.util.Date;
import java.util.concurrent.*;

public class ThreadDemo {

    public static void main(String[] args) {
          //1.继承Thread类
//        MyThread myThread = new MyThread();
//        myThread.start();
//        for (int i = 0; i < 10; i++){
//
//            System.out.println("主线程：" + new Date().getTime());
//        }

        //2.实现Runable接口(通过Thread类实现MyRunnable类)
//        Thread thread = new Thread(new MyRunnable(),"MyRunnable");
//        thread.start();
//        for (int i = 0; i < 10; i++){
//
//            System.out.println(Thread.currentThread().getName() + "主线程执行时间：" + new Date().getTime() + "执行次数" + i);
//        }

        //3.实现Callable接口
     /*   FutureTask<String> task = new FutureTask<String>(new MyCallable());
        Thread thread = new Thread(task, "MyCallable");
        thread.start();

        for (int i = 0; i < 10; i++){
            if (i == 5){
                task.cancel(true);
                return;
            }
            System.out.println(Thread.currentThread().getName() + "主线程执行时间：" + new Date().getTime() + "执行次数" + i);
        }

        try {
            String s = task.get();
            boolean done = task.isDone();
            System.out.println("是否完成：" + done);
            System.out.println("MyCallable执行结果:" + s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }*/
        //4.创建线程池
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        executorService.execute(new MyRunnable());
//
//        for (int i = 0; i < 10; i++){
//            System.out.println(Thread.currentThread().getName() + "主线程执行时间：" + new Date().getTime() + "执行次数" + i);
//        }
    }
}
