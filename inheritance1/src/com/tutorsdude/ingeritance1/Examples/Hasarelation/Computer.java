package com.tutorsdude.ingeritance1.Examples.Hasarelation;

public class Computer {


    public String brand;
    public Monitors monitors;
    public Keyboard keyboard;
    public Ram[] ram;
    public Speaker[] speaker;
    public Display display;



        public void printall(){
        System.out.println("brand:" + brand);
        System.out.println("monitors:" + monitors);
        System.out.println("keyboard:" + keyboard);

        for(int i =0; i< ram.length; i++){
            ram[i].printram();

        }
        for(int i= 0; i<speaker.length; i++){
            speaker[i].printSpeaker();
        }


        }

    }












