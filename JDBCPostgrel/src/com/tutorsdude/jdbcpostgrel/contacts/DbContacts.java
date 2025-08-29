package com.tutorsdude.jdbcpostgrel.contacts;

public enum DbContacts {

    URL("jdbc:postgresql://localhost:5433/postgres"),USER_NAME("postgres"),PASSWORD("kalinga@567"),
    DRIVER("org.postgresql.Driver");

   private String value;


    DbContacts (String value){
        this.value = value;

    }

    public String getValue(){
        return this.value;
    }


}

