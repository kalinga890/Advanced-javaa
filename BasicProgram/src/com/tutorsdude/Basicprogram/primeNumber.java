package com.tutorsdude.Basicprogram;

public class primeNumber {
    public static void main(String[] args) {
        int a = 13;
        int count = 0;
        for(int i=1;i<=a; i++){
            if(a%i==0) {
                count++;
            }
        }
        if(count==2){
            System.out.println("given no is prime");
        }
        else
            System.out.println("given no is not a prime no");
    }


}


