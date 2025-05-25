package com.tutorsdude.Default.types;

 class Runner1 {

    public static void main(String[] args) {

        Example example1 = new Example();

        example1.weight = 20;
        example1.height = 6.4;
        example1.age = 15;
        example1.name = "abhishek";
        example1.happy = true;

        System.out.println(example1.age);
        System.out.println(example1.name);
        System.out.println(example1.happy);
        System.out.println(example1.height);
        System.out.println(example1.weight);

        Example.Moving();

        Example example2 = new Example();
        example2.weight = 20;
        example2.height = 6.4;
        example2.age = 15;
        example2.name = "abhishek";
        example2.happy = true;


        System.out.println(example2.age);
        System.out.println(example2.name);
        System.out.println(example2.happy);
        System.out.println(example2.height);
        System.out.println(example2.weight);

        example1.age = 20;
        example1.name = " shiva reddy";

        System.out.println(example1.age);
        System.out.println(example1.name);

    }
}
