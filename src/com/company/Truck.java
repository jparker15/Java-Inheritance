package com.company;

public class Truck extends Car{

    private byte extraTires;
    private boolean isMultiAxle;

    public Truck(String color, String make, String model, Boolean isUsed, byte extraTires, boolean isMultiAxle) {
        super(color, make, model, isUsed);
        this.extraTires = extraTires;
        this.isMultiAxle = isMultiAxle;
    }

    public void axleWarning(boolean isMultiAxle){
        if(isMultiAxle){
            System.out.println("There could be toll rates related to amount of axles over two");
        }
    }



}
