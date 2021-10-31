package com.company.devices;

import com.company.Device;
import com.company.Human;
import com.company.Saleable;

import java.awt.*;

public class Car extends Device implements Saleable {


    public Car(Integer yearOfProduction) {
        super(yearOfProduction);
    }

    void turnOn(){

        System.out.println("Wrr ");
    }

    public void sale(Human seller, Human buyer, Double price) {
        if(seller.car != this) {
            System.out.println("Soprzedawca nie ma samochodu");
        } else if (buyer.cash < price) {
            System.out.println("Za mało kasy na samochod");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.telefon = null;
            buyer.car = this;
            System.out.println("Samochod "+ this.producer + " został sprzedany za " + price);
        }
    }

    public String showCar(){return "Marka: "+producer + " Model: "+model + " Rok produkcji: "+year+ " Waga: "+ weight+" Liczba drzwi: "+doors;}
}
