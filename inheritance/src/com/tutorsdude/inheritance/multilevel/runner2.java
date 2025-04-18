package com.tutorsdude.inheritance.multilevel;

public class runner2 {
    public static void main(String[] args){

        brinjal b = new brinjal();
        b.price = 50;
        System.out.println(b.price);

        brinjal b1 = new brinjal();
        System.out.println(b1.shape);

        brinjal b2 = new brinjal();
        System.out.println(b2.quantity);

        agroshopy a = new agroshopy();
        System.out.println(a.price);

        agroshopy a1 = new agroshopy();
        System.out.println(a1.color);

        agroshopy a2 = new agroshopy();
        System.out.println(a2.hybrid);
    }
}
