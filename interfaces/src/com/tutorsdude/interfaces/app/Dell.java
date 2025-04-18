package com.tutorsdude.interfaces.app;

public class Dell implements Laptop {
    @Override
    public void brand() {
        System.out.println("Laptop brand name is Dell");
    }

    @Override
    public void price() {
        System.out.println("Dell laptop price range between 30000 to 1 lakh");
    }

    @Override
    public void colour() {
        System.out.println("Dell laptop colour like silver,black,and gray");
    }

    @Override
    public void storage() {
        System.out.println("Dell laptop storage range between 256gb to upto 2tb ");
    }
}
