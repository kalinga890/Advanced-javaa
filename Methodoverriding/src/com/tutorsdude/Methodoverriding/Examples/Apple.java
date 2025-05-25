package com.tutorsdude.Methodoverriding.Examples;

public class Apple extends Fruits {

        @Override
    public void vitamins(){

            System.out.println("Apple contain vitamin c,vitamin A ,and vitamin b6");

            System.out.println("vitamins B help keep skin healthy");

            System.out.println("vitamins c is a natural antioxidant that helps the immune system");


        }

 @Override
    public  void protein(){

        int price = 500;
        String name = "antibodies";
        float percentage = 5.5f;

        System.out.println(price);
        System.out.println(name);
        System.out.println(percentage);


    }


}
