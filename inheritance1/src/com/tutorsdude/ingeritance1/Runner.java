package com.tutorsdude.ingeritance1;

import com.tutorsdude.ingeritance1.Examples.Hasarelation.*;
import com.tutorsdude.ingeritance1.mutilevel.Apple;
import com.tutorsdude.ingeritance1.mutilevel.Redapple;
import com.tutorsdude.ingeritance1.single.Cat;

public class Runner {
    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.colour = "brown";
        c1.food = "milk";
        c1.name = "dog";

        c1.sound();
        c1.moves();

        System.out.println(c1.colour);
        System.out.println(c1.food);
        System.out.println(c1.name);

        Redapple r1 = new Redapple();
        r1.protien = "vitamin b1";
        r1.vitamis = "b12";
        r1.color = "green";
        r1.tests();

        Apple a1 = new Apple();
        a1.price = 100;
        a1.shape = "circule";
        a1.place();

        Computer c2 = new Computer();
        c2.brand = "hp";
        System.out.println(c2.brand);

        Keyboard k1 = new Keyboard();
        k1.price = 1000;
        k1.brand = "petronics";
        k1.noofkeys = 40;

      k1.printall();

        Display d1 = new Display();
        d1.resolution = "ryzen";
        d1.brand = "dell";
        d1.printdispaly();

        Monitors m1 = new Monitors();
        m1.brand = "Acer";
        m1.price = "14000";

        m1.printmonitors();































    }
}
