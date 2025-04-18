package com.tutorsdude.interfaces.app;

public class Logitech implements Keyboard {
    @Override
    public void brand() {
        System.out.println("Keyboard brand name is logitech");
    }

    @Override
    public void price() {
        System.out.println("logitech keyboard price range between 2000 to 7000");
    }

    @Override
    public void colour() {
        System.out.println("Logitech keyboard come in a variety of colours like black,gray,silver, and white");
    }

    @Override
    public void connectivity() {
        System.out.println("logitech keyboards  are connectivity through wired nad wireless ");
    }
}
