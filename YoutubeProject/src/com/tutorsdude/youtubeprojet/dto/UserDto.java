package com.tutorsdude.youtubeprojet.dto;

public class UserDto {

    private String username;
    private int noofvedioupload;
    private String password;
    private String location;
    private int pincode;


    public UserDto(String location, int noofvedioupload, String password, int pincode, String username) {
        this.location = location;
        this.noofvedioupload = noofvedioupload;
        this.password = password;
        this.pincode = pincode;
        this.username = username;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int noofvedioupload(){
        return noofvedioupload++;
    }


    public int getNoofvedioupload() {
        return noofvedioupload;
    }

    public void setNoofvedioupload(int noofvedioupload) {
        this.noofvedioupload = noofvedioupload;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
