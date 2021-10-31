package com.company.devices;

import com.company.Device;
import com.company.Human;
import com.company.Saleable;

public class Phone extends Device implements Saleable  {

    Double screenSize;
    public String os;

    public Phone(String producer) {
        super();
    }

    public void turnOn(){
        System.out.println("Włącz");
    }
    public String toString(){
        return "Producer: "+ producer+"Model: "+model+"Przekatna ekranu: "+screenSize+"Cali"+"System Operacyjny: "+os;
    }


    @Override
    public void sale(Human seller, Human buyer, Double price) {
        if(seller.telefon != this) {
            System.out.println("Soprzedawca nie ma telefonu");
        } else if (buyer.cash < price) {
            System.out.println("Za mało kasy");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.telefon = null;
            buyer.telefon = this;
            System.out.println("Telefon "+ this.producer + " został sprzedany za " + price);
        }
    }
}
