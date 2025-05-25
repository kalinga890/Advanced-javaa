package com.tutorsdude.Abstract.Example;

public  class Dell extends Laptop {

    @Override

    public   void colour(){

        System.out.println("Dell laptop colour is blue");


    }

    @Override
    public void processors() {
        System.out.println("Dell laptop processors is ryzen");

    }
    @Override
    public  void storage(){
        System.out.println("Dell laptop storage is 2tb ssd");

    }


}
