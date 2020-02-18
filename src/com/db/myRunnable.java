package com.db;

public class myRunnable implements Runnable {
    boolean isRunning = true;

    String name;

    public myRunnable (String name){
        this.name = name;
        System.out.println(name);
    }
    @Override
    public void run() {
        int count = 0;
        while (isRunning){
            System.out.println(name+ ": " + count);
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
