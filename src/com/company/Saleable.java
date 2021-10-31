package com.company;

public interface Saleable {
    //void sale();

    void sale(Human seller, Human buyer, Double price) throws Exception;
   // Double getPrice();
}
