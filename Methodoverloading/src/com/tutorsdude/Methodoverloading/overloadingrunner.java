package com.tutorsdude.Methodoverloading;


import com.tutorsdude.Methodoverloading.types.*;

import static com.tutorsdude.Methodoverloading.types.Bloodratio.percentage;

public class overloadingrunner {

    public static void main(String[] args) {

        float value = Bloodratio.percentage(2.2f,3.3f);
        System.out.println(value);

        float addvalue = Bloodratio.percentage(2.2f,3.3f,4.4f);
        System.out.println(addvalue);

        float returnvalue = Bloodratio.percentage(2.2f,3.3f,4.4f,5.5f);
        System.out.println(returnvalue);

        Gecgcollege c1 = new Gecgcollege();
        c1.details(800,"gecg",20.5f,600);

        Gecgcollege g1 = new Gecgcollege();
        g1.details(500,"gecg");

        Gecgcollege g2 = new Gecgcollege();
        g2.details(300,"gecg",40.5f);

        Laptop laptop1 = new Laptop();
        laptop1.information(40000 ,"dell");

       Laptop laptop2 = new Laptop();
       laptop2.information("hp",50000);

       Laptop laptop3 = new Laptop();
       laptop3.information("lenova",2,65000);



    }
}
