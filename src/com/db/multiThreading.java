package com.db;


public class multiThreading extends Thread {
    boolean isRunning = true;

   String name;

    public multiThreading (String name){
        this.name = name;
        System.out.println(name);
    }
    @Override
    public void run() {
       Display();
    }

  void Display (){
        int count = 0;
        while (count < 20){
            System.out.println(name + ": " + count);
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
