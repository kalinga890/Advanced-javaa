package com.tutorsdude.Methodoverloading.types;

public class Bloodratio {

       // changing the number of parameter

    public static float percentage(float a, float b) {
        float add = a + b;
        return add;

    }

    public static float percentage(float a, float b, float c) {

        float add = a + b + c;
        return add;
    }

    public static float percentage(float a, float b, float c, float d) {

        float add = a + b + c + d;
        return add;


    }
}
