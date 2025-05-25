package com.tutorsdude.Nonaccessmodifier.Examples;

public class Balakundi {

    public  static int pincode;
    public int noofcaste;
    public String address;
    public String house;
    public static String taluk;
    public  static String district;

    public void village(){
        System.out.println("my village name is balakundi");
    }

    static {

        int pincode = 583122;
        String taluk = "siruguppa";
        String district = "ballary";

        System.out.println("district name is :" + district );
        System.out.println("taluk name is :" + taluk);
        System.out.println("pincode :" + pincode );
    }


    public void printAll() {
        System.out.println("Noof Caste: " + noofcaste);
        System.out.println("Address: " + address);
        System.out.println("House: " + house);
        System.out.println("District: " + district);
        System.out.println("Taluk: " + taluk);
        System.out.println("Pincode: " + pincode);

    }

}
