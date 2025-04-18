package com.tutorsdude.interfaces.app;

public class Bmw implements Car{


    @Override
    public void colour() {
        System.out.println("Bmw cars widely range of colour like white,black,silver,blue ");
    }

    @Override
    public void price() {
        System.out.println("Bmw cars price range to 45.9 lakh to 2.50 lakh");

    }

    @Override
    public void enginetype() {
        System.out.println("Bmw cars are used engine type like petrol engine,diesel engine, and electric engine ");
    }

    @Override
    public void speed() {
        System.out.println("Bmw cars speed range between 120 to 150 mph");
    }
}
