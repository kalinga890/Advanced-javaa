package com.tutorsdude.Nonaccessmodifier.Examples;

public class Cartierwatch {

    public  static String brand;
    public int price;
    public int year;
    public  static String companyname;
    public String color;
    public static String owner;

    public static void shape(){
        System.out.println("Cartier watch Shape is rectangular");
    }


    public void printAll() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Year: " + year);
        System.out.println("Company: " + companyname);
        System.out.println("Owner: " + owner);
        System.out.println("Color: " + color);
    }


}
