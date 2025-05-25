package com.tutorsdude.Nonaccessmodifier;

import com.tutorsdude.Nonaccessmodifier.Examples.*;

public class Runner {

    public static void main(String[] args) {

        Gecg.playing();

        Balakundi b1 = new Balakundi();
        b1.village();

        Bmwcar.speed();
        Cartierwatch.shape();

        Bananas b2 = new Bananas();
        b2.vitamin();

        Bmwcar.brand = "Lexus";
        Bmwcar.manufacturer = "Bmw";
        Bmwcar.operatingSystem = "idrive";

        Cartierwatch.brand = "Cartier";
        Cartierwatch.companyname = "Cartier international snc";
        Cartierwatch.owner = "Richemont";

        Bananas.scinenticname = "Musa paradisiaca Linn";
        Bananas.age = 591;

        Gecg.collegename = "Gecg";
        Gecg.pincode = 583227;
        Gecg.university = "visvesvaraya technological university (vtu)";
        Gecg.location = "Gangavathi";

       Balakundi.pincode = 583122;
       Balakundi.district = "ballary";
       Balakundi.taluk = "siruguppa";

        Bmwcar bmwcar = new Bmwcar();
        bmwcar.model = "bmw x1";
        bmwcar.color = "red";
        bmwcar.price = 72000;
        bmwcar.engine = "s65";


        Bmwcar bmwcar2 = new Bmwcar();
        bmwcar2.model = "bmw x2";
        bmwcar2.color = "white";
        bmwcar2.price = 92000;
        bmwcar2.engine = "s63";


        Bmwcar bmwcar3 = new Bmwcar();
        bmwcar3.model = "bmw x3";
        bmwcar3.color = "black";
        bmwcar3.price = 95000;
        bmwcar3.engine = "s67";

        bmwcar2.printAll();
        bmwcar3.printAll();
        bmwcar.printAll();

        // cartier watch
        Cartierwatch cartierwatch = new Cartierwatch();
        cartierwatch.color = "red";
        cartierwatch.price = 52000;
        cartierwatch.year = 1847;

        cartierwatch.printAll();

        Cartierwatch cartierwatch1 = new Cartierwatch();
        cartierwatch1.color = "white";
        cartierwatch1.price = 42000;
        cartierwatch1.year = 1947;

        cartierwatch1.printAll();

        // Bananas example
        Bananas bananas = new Bananas();
        bananas.color = "yellow";
        bananas.price = 100;
        bananas.vitamin = "vitamin B6";

        bananas.printAll();

        Bananas bananas1 = new Bananas();
        bananas1.color = "red";
        bananas1.price = 50;
        bananas1.vitamin = "vitamin C";

        bananas1.printAll();

        // Gecg information

        Gecg gecg = new Gecg();
        gecg.noofstudents = 800;
        gecg.year = 2018;
        gecg.department = "cse";
        gecg.noofrooms = 50;

        gecg.printAll();

        Gecg gecg1 = new Gecg();
        gecg1.noofstudents = 700;
        gecg1.year = 2019;
        gecg1.department = "EC";
        gecg1.noofrooms = 40;

        gecg1.printAll();

        // balakundi

        Balakundi balakundi = new Balakundi();
        balakundi.house = "madivala";
        balakundi.address = "near suklamma temple";
        balakundi.noofcaste = 10;

        balakundi.printAll();


        Balakundi balakundi1 = new Balakundi();
        balakundi1.house = "vinayak";
        balakundi1.address = "near bus stand";
        balakundi1.noofcaste = 8;

        balakundi1.printAll();






    }
}
