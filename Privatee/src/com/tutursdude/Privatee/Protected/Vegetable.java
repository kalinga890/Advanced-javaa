package com.tutursdude.Privatee.Protected;

public class Vegetable {

    protected String name;
    protected int price;
    protected String color;






    protected  static void Vegetable(){
        System.out.println("vegetable");
    }

    protected Vegetable(String name, int price, String color){
        this.name = name;
        this.price = price;
        this.color = color;

    }

    public static void main(String[] args) {

        Vegetable vegetable = new Vegetable();










    }
}
