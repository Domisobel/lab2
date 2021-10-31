package com.company.devices;

import com.company.Device;
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
    public void sale() {

    }

    @Override
    public Double getPrice() {
        return null;
    }
}
