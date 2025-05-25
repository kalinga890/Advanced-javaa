package com.tutortude.hotel.mayurhotel;

public class Hotel {

    public String hostelname;
    public String foundername;
    public Guest[] guest;
    public Rooms rooms;
    public Staff staff;
    public Deparment department;
    public Hoteladdress hoteladdress;

    public void printAll() {
        System.out.println("Hostel: " + hostelname);
        System.out.println("Founder: " + foundername);
        for (int i = 0; i < guest.length; i++) {
            guest[i].printAll();

        }
    }



}
