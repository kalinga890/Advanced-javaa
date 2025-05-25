package com.tutursdude.Privatee.private1;

public class House {

    private int totalmembers;
    private String houses;
    private int cash;
    private float height;


    private static void Housename(){
        System.out.println("House name is garuda ");
    }

    private House(){
        System.out.println("House is garuda ");
    }

    private House(int totalmembers, String houses, int cash, float height){
        this.totalmembers = totalmembers;
        this.houses = houses;
        this.cash = cash;
        this.height = height;

    }

   private static class Geek {


       void display() {
           System.out.println("hello world");
       }
   }

    public static void main(String[] args) {
        House house = new House();
        house.cash = 100;
        house.totalmembers = 10;
        house.height = 6.5f;
        System.out.println(house.totalmembers);
        System.out.println(house.houses);
        System.out.println(house.cash);
        System.out.println(house.height);

        House house2 = new House();
        house2.cash = 300;
        house2.totalmembers = 20;
        house2.height = 6.5f;
        System.out.println(house.totalmembers);
        System.out.println(house.houses);

        System.out.println(house.cash);

        House.Housename();

      House.Housename();

      Geek G1 = new Geek();
      G1.display();








    }

}
