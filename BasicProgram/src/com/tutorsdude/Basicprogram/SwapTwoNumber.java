package com.tutorsdude.Basicprogram;

public class SwapTwoNumber {

    public static void main(String[] args) {

        int a = 15, b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a :" + a + " b :" + b);

    }
}
