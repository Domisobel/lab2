package com.company.devices;

import com.company.Device;

public class Car extends Device {


    public Car(Integer yearOfProduction) {
        super(yearOfProduction);
    }

    void turnOn(){
        System.out.println("Wrr ");
    }

    public String showCar(){return "Marka: "+producer + " Model: "+model + " Rok produkcji: "+year+ " Waga: "+ weight+" Liczba drzwi: "+doors;}
}
