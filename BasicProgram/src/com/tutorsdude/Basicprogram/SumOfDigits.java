package com.tutorsdude.Basicprogram;

public class SumOfDigits {

    public static void main(String[] args) {
        int n  =123457;
        int sum = 0;

        while (n !=0){
            sum+= n% 10; // it is gives last number and after adding the number
            n /= 10; // this statement meaning is removes the last digits number

        }

        System.out.println("sum of digits : "+ sum);
    }




}
