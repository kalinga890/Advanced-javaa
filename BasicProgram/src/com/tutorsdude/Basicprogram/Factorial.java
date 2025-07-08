package com.tutorsdude.Basicprogram;

public class Factorial {
    public static void main(String[] args) {

        int num = 10;

        long fact = 1;

        for (int i = 1; i <=num ; i++) {

            fact*=num;
            System.out.println("factorial: "+ fact);

        }
    }
}


