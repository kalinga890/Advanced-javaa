package com.tutorsdude.accessspecifiers.types;

  public class Example {

    public String name;
      public int price;
      public float weight;
      public double height;
      public byte age;
      public boolean gender;


      public static void welcome() {
          System.out.println("Welcome to TutorsDude");
      }



      public Example() {
          System.out.println("Constructor");
      }

      public Example(String name, int price, float weight, double height, byte age, boolean gender) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.gender = gender;

      }

     public static void  name(){
          System.out.println("kalinga A");

      }



      public static void main(String[] args) {

        Example example = new Example();
        example.age = (byte) 25;
        example.gender = true;
        example.height = 5.5f;
        example.weight = 6.5f;
        example.price = 300;

        System.out.println(example.name);
        System.out.println(example.price);
        System.out.println(example.weight);
        System.out.println(example.height);
        System.out.println(example.age);
        System.out.println(example.gender);

        Example.welcome();

        Example example1 = new Example();

        Example.name();

        example1.age = (byte) 22;
        example1.gender = false;
        example1.height = 5.6f;
        example1.weight = 6.5f;
        example1.price = 500  ;

        System.out.println(example1.name);
        System.out.println(example1.age);
        System.out.println(example1.gender);
            System.out.println(example1.height);
            System.out.println(example1.weight);



    }



}

