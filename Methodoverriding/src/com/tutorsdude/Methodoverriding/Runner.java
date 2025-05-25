package com.tutorsdude.Methodoverriding;

import com.tutorsdude.Methodoverriding.Examples.*;

public class Runner {

    public static void main(String[] args) {

        Mobile m1  = new Mobile();
        m1.calling();

        Redmi r1 = new Redmi();
        r1.calling();

        Animal a1 = new Animal();
        a1.sound();



        Tiger t1 = new Tiger();
        t1.sound();


        Fruits f1 = new Fruits();
        f1.vitamins();


        Apple a2 = new Apple();
        a2.vitamins();

       Fruits f2 = new Fruits();
       f1.protein();


       Apple f3 = new Apple();
       f3.protein();

       Animal animal = new Animal();
       animal.reproduction();

       Tiger tiger = new Tiger();
       tiger.reproduction();

       Mobile mobile = new Mobile();
       mobile.processor();

       Redmi redmi = new Redmi();
       redmi.processor();















    }
}
