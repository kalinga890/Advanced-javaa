package com.tutorsdude.Nonaccessmodifier.Examples;

public class Bmwcar {

    public int price;
    public String color;
    public String engine;
    public static String brand;
    public  static String manufacturer;
    public String model;
    public static String operatingSystem;

    public static void speed(){
        System.out.println("the bmw m4 csl has the hight spped is 191 mph  ");
    }

    public  void printAll() {

                System.out.println("price: " + price);
                System.out.println("color: " + color);
                System.out.println("engine: " + engine);
                System.out.println("brand: " + brand);
                System.out.println("manufacturer: " + manufacturer);
                System.out.println("model: " + model);
                System.out.println("operatingSystem: " + operatingSystem);
    }


}
