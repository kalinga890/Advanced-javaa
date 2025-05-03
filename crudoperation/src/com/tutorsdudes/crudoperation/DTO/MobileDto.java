package com.tutorsdudes.crudoperation.DTO;

public class MobileDto {

    private String brandName;
    private int price;
    private String colour;
    private String processor;
    private float zoomLevel;

          // constructor method

    public MobileDto(String brandName, int price, String colour, String processor,float zoomLevel){

        this.brandName = brandName;
        this.colour = colour;
        this.processor = processor;
        this.price = price;
        this.zoomLevel = zoomLevel;

    }

    public MobileDto(){
        System.out.println("no arguments parameters");
    }

    // getter  and setter method


    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public float getZoomLevel() {
        return zoomLevel;
    }

    public void setZoomLevel(float zoomLevel) {
        this.zoomLevel = zoomLevel;
    }
}
