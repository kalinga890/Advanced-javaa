package com.tutorsdude.Methodoverloading.types;

public class Laptop {

    // changing the order of parameter

    public void information(int price, String name) {

        System.out.println("laptop price is:" + price);
        System.out.println("laptop name is :" + name);


    }

    public void information( String name, int price) {

        System.out.println("laptop price is:" + price);
        System.out.println("laptop name is :" + name);
    }

    public void information( String name, int nooffan,int price) {

        System.out.println("laptop price is:" + price);
        System.out.println("laptop name is :" + name);
        System.out.println("total no of fan:"+ nooffan);

    }
}
