package com.tutorsdude.accessspecifiers;

import com.tutorsdude.accessspecifiers.types.Example;

public class Accessrunner {
    public static void main(String[] args) {

        Example example = new Example();
        example.age= 20;
        example.name="kalinga";
        example.price = 200;
        example.height = 5.5f;

        System.out.println(example.name);
        System.out.println(example.price);
        System.out.println(example.height);
        System.out.println(example.age);

        Example.welcome();

        Example example1 = new Example();
        example1.age= 20;
        example1.name="kalinga";
        example1.price = 200;
        example1.height = 5.5f;

        System.out.println(example1.name);
        System.out.println(example1.price);
        System.out.println(example1.height);
        System.out.println(example1.age);





    }
}
