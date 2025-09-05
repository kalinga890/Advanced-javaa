package com.tutorsdude.youtubeprojet.Constants;

public enum DbConstants {

    URL("jdbc:postgresql://localhost:5433/youtubedb"),USER_NAME("postgres"),PASSWORD("kalinga@567"),
    DRIVER("org.postgresql.Driver");

    private String value;


    DbConstants(String value){
        this.value = value;

    }

    public String getValue(){
        return this.value;
    }
}
