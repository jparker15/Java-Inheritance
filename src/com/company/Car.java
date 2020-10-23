package com.company;

public class Car {

    private String color;
    private String model;
    private String make;
    private int year;
    private boolean isUsed = false;

    public Car(String color, String make, String model, Boolean isUsed){
        this.color = color;
        this.make = make;
        this.model = model;
        this.isUsed = false;
    }

}

