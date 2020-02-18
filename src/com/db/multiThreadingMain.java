package com.db;

import java.util.Date;

public class multiThreadingMain {
    public static void main(String[] args) throws InterruptedException {
        multiThreading milti = new multiThreading("Thread");
        milti.start();

        Date d = new Date();


        multiThreading multi = new multiThreading("SubThread");
        multi.start();
        System.out.println("Thread is working");

        Thread.sleep(6000);

//        milti.isRunning = false;
//
//
//        myRunnable r = new myRunnable("Runnable");
//        Thread t = new Thread(r);
//        t.start();

    }

}
