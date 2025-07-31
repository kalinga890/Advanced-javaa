package com.tutorsdude.ExceptionHanding;

public class CountDownTime {

    public static void main(String[] args) {


            System.out.println("Countdown starting");
            for (int i = 5; i >=1; i--) {
                System.out.println(i);

                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e){
                    System.out.println("countdown interrupted");
                }



        }
        System.out.println("Countdown finished");
    }
}
