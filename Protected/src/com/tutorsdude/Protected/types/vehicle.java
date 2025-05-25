package com.tutorsdude.Protected.types;



public class vehicle  {

    protected String name;
    protected int price;
    protected String color;

    protected static void breaking(){
        System.out.println("car is a breaking");
    }

    protected vehicle(){
        System.out.println("car is a vehicle");
        
    }
    public vehicle(String name, int price, String color){
        this.name = name;
        this.price = price;
        this.color = color;

    }


    public static void main(String[] args) {
        vehicle vehicle = new vehicle();
        vehicle.name="Alex";
        vehicle.price=50;
        vehicle.color="red";

        System.out.println(vehicle.name);
        System.out.println(vehicle.price);
        System.out.println(vehicle.color);

        vehicle.breaking();

        vehicle = new vehicle();
        vehicle.name="Alex";
        vehicle.price=50;
        vehicle.color="red";
        System.out.println(vehicle.name);
        System.out.println(vehicle.price);
        System.out.println(vehicle.color);

    }
}
