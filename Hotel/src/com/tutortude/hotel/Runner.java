package com.tutortude.hotel;

import com.tutortude.hotel.mayurhotel.Guest;
import com.tutortude.hotel.mayurhotel.Hotel;

public class Runner {
    public static void main(String[] args) {


        Hotel hotel1 = new Hotel();
        hotel1.hostelname = "reddy hotel";
        hotel1.foundername = "srinivas";

       System.out.println(hotel1.hostelname );
       System.out.println(hotel1.foundername );

        Guest guest = new Guest();
        guest.guestname = "kalinga A";
        guest.guestid = 1012;
        guest.guestaddress = " ballary";
        guest.guestemail = "kalinga@gmail.com";

        Guest guest1 = new Guest();
        guest1.guestname = "VENKY A";
        guest1.guestid = 1018;
        guest1.guestaddress = " GADAG";
        guest1.guestemail = "venky@gmail.com";

        Guest guest2 = new Guest();
        guest2.guestname = "soma A";
        guest2.guestid = 1042;
        guest2.guestaddress = " gvt";
        guest2.guestemail = "somaa@gmail.com";

      Guest[] guests = {guest1, guest2,guest};
      hotel1.guest = guests;


























    }
}
