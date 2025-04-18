package com.tutorsdude.inheritance.multiple;

public class runner1 {

    public static void main(String[] args){

        dancer d = new dancer();
        System.out.println(d.age);
        System.out.println(d.name);

        singer s = new singer();
        System.out.println(s.price);

        venky v = new venky();
        System.out.println(v.price);

        venky v1 = new venky();
        System.out.println(v1.salary);
    }
}
