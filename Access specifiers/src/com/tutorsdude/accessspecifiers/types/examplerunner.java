package com.tutorsdude.accessspecifiers.types;

public class examplerunner {



    public static void main(String[] args) {
        Example example = new Example();
        example.price = 200;
        example.height = 8.8f;
        example.name = "manju";
        example.age = 30;


        System.out.println(example.name);
        System.out.println(example.age);
        System.out.println(example.price);
        System.out.println(example.height);

        Example.welcome();

        Example example1 = new Example();

        example1.price = 200;
        example1.height = 8.8f;
        example1.name = "manju";
        example1.age = 30;
        System.out.println(example1.name);
        System.out.println(example1.age);

        System.out.println(example1.price);
        System.out.println(example1.height);
        System.out.println(example1.name);
        System.out.println(example1.age);
        System.out.println(example1.price);



    }
}
