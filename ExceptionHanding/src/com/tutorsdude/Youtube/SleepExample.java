package com.tutorsdude.ExceptionHanding;

public class SleepExample {

    public static void main(String[] args) {

       try {
           System.out.println("waiting for 2 seconds");
           Thread.sleep(2000);

           System.out.println("Done waiting!");
       } catch (InterruptedException e){
           System.out.println("Thread was interrupted");
       }
    }
}
