package com.company;

public class Animal implements Saleable {
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    private static final Double DEFAULT_DOG_WEIGHT = 12.0;
    private static final Double DEFAULT_CAT_WEIGHT = 2.3;
    final String species;
    String name;
    Double weight;
    Integer age;
    Boolean alive;

    Animal(String species) {
        this.species = species; //wartosc z parametru
        this.alive = true; //wartosc domyslna
        if (this.species == "canis") {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (this.species == "felis") {
            this.weight = DEFAULT_CAT_WEIGHT;
        } else {
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    void feed() {
        if(weight>0) {
            weight++;
            System.out.println("Moja waga to: " + weight);
        }else{
            System.out.println("Zwierze nie żyje");
        }
    }
    void takeForAWalk() {
        weight--;
        if(weight==0){
            System.out.println("Już za późno ");
            alive=false;
        }else if(alive==false){
            System.out.println("Przykro mi ");
        }
        else{
            System.out.println("Moja waga to: " + weight);
        }
    }
    void feed(Double foodWeight) {
        weight += foodWeight;
        System.out.println("Ilosc jedzenia: " + weight);
    }
    Double getWeight() {
        return weight;
    }


    @Override
    public void sale(Human seller, Human buyer, Double price) {
        if(seller.pet != this) {
            System.out.println("Sprzedaz zwierzaka");
        } else if (buyer.cash < price) {
            System.out.println("Sprzedawca nie ma zwierzaka");
        } else if( this instanceof Human) {
            System.out.println("Halo policja");
        } else
            seller.cash += price;
            buyer.cash -= price;
            seller.pet = null;
            buyer.pet = this;
            System.out.println("Zwierze "+ this.name + " został sprzedany za " + price);
        }


    public String toString()
    {
        return "Imię: " + name + " Waga: " + weight  +" Lata: " + age + " Czy zyje : "+ alive;
    }
}
