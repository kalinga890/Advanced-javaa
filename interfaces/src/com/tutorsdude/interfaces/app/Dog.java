package com.tutorsdude.interfaces.app;

public class Dog  implements Animal{


    @Override
    public void sound() {
        System.out.println("Dog sound like barking, growling,howling,whining");
    }

    @Override
    public void food() {
        System.out.println("Dogs are eats fish, wed food,dry food,raw food");

    }

    @Override
    public void reproduction() {
        System.out.println("Dogs are reproduction through sexual");

    }

    @Override
    public void shape() {
        System.out.println("Dogs are widely range of long and low");

    }
}
