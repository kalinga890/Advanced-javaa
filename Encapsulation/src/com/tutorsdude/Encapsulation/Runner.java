package com.tutorsdude.Encapsulation;

import com.tutorsdude.Encapsulation.Example.Bank;

public class Runner {

    public static void main(String[] args) {

        Bank b1 = new Bank();

        b1.setAccountholdername("kalinga");

        System.out.println(b1.getAccountholdername());

        b1.setTaluk("siruguppa");
        System.out.println(b1.getTaluk());

       b1.setDistrict("ballari");
        System.out.println(b1.getDistrict());

        b1.setProfitratio(20.12f);
        System.out.println(b1.getProfitratio());

     b1.setCountry("india");
        System.out.println(b1.getCountry());

        b1.setBrachcode(10653);
        System.out.println(b1.getBrachcode());

        b1.setVillage("balakundi");
        System.out.println(b1.getVillage());

        b1.setNoofbrach(600);
        System.out.println(b1.getNoofbrach());

        b1.setBankrating(7.7f);
        System.out.println(b1.getBankrating());

        b1.setState("karnataka");
        System.out.println(b1.getState());

        b1.setNoofrooms(20);
        System.out.println(b1.getNoofrooms());

        b1.setNoofcomputer(40);
        System.out.println(b1.getNoofcomputer());

        b1.setNoofemployee(50);
        System.out.println(b1.getNoofemployee());

        b1.setNoofcashcounter(5);
        System.out.println(b1.getNoofcashcounter());

        b1.setManagername("abhishek");
        System.out.println(b1.getManagername());

        b1.setIsacanarabank(true);
        System.out.println(b1.getisIsacanarabank());

        b1.setIfsecode(" CNRB0010635");
        System.out.println(b1.getIfsecode());

        b1.setCutomeraddress("near suklamma temple balakundi");
        System.out.println(b1.getCutomeraddress());

        b1.setCustomerid(5671);
        System.out.println(b1.getCustomerid());

       b1.setAccountNumber("061280019628");
        System.out.println(b1.getAccountNumber());

        b1.setName("canara bank");
        System.out.println(b1.getName());

        b1.setCustomerratio(6.6f);
        System.out.println(b1.getCustomerratio());

       b1.setPincode(583122);
        System.out.println(b1.getPincode());

        b1.setNoofbank(300);
        System.out.println(b1.getNoofbank());

        b1.setFeedback("canara bank is a quik response to customer to help bank issues problem");
        System.out.println(b1.getFeedback());

        b1.setBankisgoodplatform(true);
        System.out.println(b1.getisBankamountsafety());

        b1.setBankamountsafety(true);
        System.out.println(b1.getisBankamountsafety());

        b1.setUserratio(8.9f);
        System.out.println(b1.getUserratio());

        b1.setProvidemutipleaccount(false);
        System.out.println(b1.getisProvidemutipleaccount());

      b1.setBankprovideinterestrate(true);
        System.out.println(b1.getisBankprovideinterestrate());


        b1.amounttrasfer();
      b1.loan();











    }
}
