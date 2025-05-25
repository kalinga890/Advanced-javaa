package com.tutursdude.Privatee.default1;

public class Fruits {

    String fruitname;
    int fruitprice;
    String fruitcolor;
    String fruitsize;
    int fruitweight;

      static void Fruits() {
        System.out.println("Fruits are very sweets");

    }
     Fruits() {
        System.out.println("Fruits ");
    }
     Fruits(String fruitname, int fruitprice, String fruitcolor) {
        this.fruitname = fruitname;
        this.fruitprice = fruitprice;
        this.fruitcolor = fruitcolor;
        this.fruitweight = fruitweight;

    }

    public static void main(String[] args) {
        Fruits();

        Fruits f = new Fruits();
        f.fruitcolor = "red";
        f.fruitweight = 5;
        f.fruitsize = " 2.5f";
        f.fruitcolor = "red";
        f.fruitprice = 200;

        System.out.println(f.fruitcolor);
        System.out.println(f.fruitweight);
        System.out.println(f.fruitsize);
        System.out.println(f.fruitprice);

        Fruits f1 = new Fruits();
        f1.fruitcolor = "red";
        f1.fruitweight = 5;
        f1.fruitsize = " 2.5f";
        f1.fruitcolor = "red";
        f1.fruitprice = 200;
        System.out.println(f1.fruitcolor);
        System.out.println(f1.fruitweight);
        System.out.println(f1.fruitsize);
        System.out.println(f.fruitprice);
        System.out.println(f.fruitprice);



    }
}
