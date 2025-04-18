package com.tutorsdude.inheritance;

public class runner {

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.processer = "ryzen";
        l1.name = "hp";
        l1.price = 46000;
        l1.brand = "lenovo";
        l1.color = "siver";
        l1.model = "5000 series";

        System.out.println(l1.processer);
        System.out.println(l1.name);
        System.out.println(l1.price);
        System.out.println(l1.brand);
        System.out.println(l1.color);
        System.out.println(l1.model);


    }
}