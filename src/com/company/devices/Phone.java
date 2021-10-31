package com.company.devices;

import com.company.Device;
import com.company.creatures.Human;
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
    public void sale(Human seller, Human buyer, Double price) throws Exception{
        if(seller.telefon != this) {
            throw new Exception("oprzedawca nie ma telefonu");
           // System.out.println("Soprzedawca nie ma telefonu");
        } else if (buyer.cash < price) {
            throw new Exception("Za mało kasy");
          //  System.out.println("Za mało kasy");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.telefon = null;
            buyer.telefon = this;
            System.out.println("Telefon "+ this.producer + " został sprzedany za " + price);
        }
    }

    public void InstallApp(String nameApp){

    }
    public void InstallApp(String nameApp, Double versionApp ){

    }
    public void InstallApp(String nameApp, Double versionApp, String serverAdress){

    }

  //  public void

}
