package com.tutorsdude.Methodoverloading.types;

public class Gecgcollege {

    // changing the type of parameter


    public void details(int number, String name) {

        System.out.println("total no of students in gecg:" + number);
        System.out.println("college name is :" + name);

    }

    public void details(int number, String name, float ratio) {

        System.out.println("total no of students in gecg:" + number);
        System.out.println("college name is :" + name);
        System.out.println("total no girls of ratio :" + ratio);

    }

    public void details(int number, String name, float ratio, int marks) {

        System.out.println("total no of students in gecg:" + number);
        System.out.println("college name is :" + name);
        System.out.println("total no girls ratio in gecg :" + ratio);
        System.out.println("total marks in all subject:"+marks);



    }
}
