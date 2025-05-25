package com.tutorsdude.Protected.types;

public class car extends vehicle {

    protected String name;
    protected int price;
    protected String brand;
    protected String model;

    protected static void changing() {
        System.out.println("the car is changing the break due to  traffic singnal");
    }

    public car() {
        System.out.println("the car is a moving the passenger");
    }


    public static void main(String[] args) {

        car car = new car();
        car.brand = "Honda";
        car.model = "Audi";
        car.name = "Audi";
        car.price = 1500;

        System.out.println(car.name);
        System.out.println(car.price);
        System.out.println(car.brand);
        System.out.println(car.model);

        car c1 = new car();
        c1.brand = "Honda";
        c1.model = "Audi";
        c1.name = "Audi";
        c1.price = 1500;
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.name);
        System.out.println(c1.price);








    }
}


