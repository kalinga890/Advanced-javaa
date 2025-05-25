package com.tutorsdude.oops;

import com.tutorsdude.oops.product.*;


public class Chemicalrunner {
    public static void main(String[] args) {

        Chemical c1 = new Chemical();
        System.out.println(c1.strong);

        Chemical.name();

        Acid a1 = new Acid();
        System.out.println(a1.weak);

        Acid.weak();

        Ester e1 = new Ester();
        System.out.println(e1.colorless);

        Ester.colorless();


        Hydrocarbon h1 = new Hydrocarbon();
        System.out.println(h1.boilingState);

        Hydrocarbon.boiling();

        Hydrochloric h2 = new Hydrochloric();
        System.out.println(h2.color);

        Hydrochloric.color();

        Methylbenzoate m1 = new Methylbenzoate();
        System.out.println(m1.colorless);

        Methylbenzoate.colorless();

        Methane m2 = new Methane();
        System.out.println(m2.density);

        Methane.density();

        Ethene m3 = new Ethene();
        System.out.println(m3.uses);

        Ethene.etheneuses();

        Hydrochloric m4 = new Hydrochloric();
        System.out.println(m4.solubility);

        Hydrochloric.viscosity();






    }
}
