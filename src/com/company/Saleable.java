package com.company;

import com.company.creatures.Human;

public interface Saleable {
    //void sale();

    void sale(Human seller, Human buyer, Double price) throws Exception;
   // Double getPrice();
}
