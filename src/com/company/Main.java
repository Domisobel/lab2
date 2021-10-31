package com.company;


import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Phone motorola=new Phone("Motorola");
        motorola.os="Motorola";
        Pet dog = new Pet("canis");
        Pet cat = new Pet("felis");
        dog.name = "Szarik";
        dog.weight = 3.5;
        dog.age = 2;
        dog.alive = true;



        Car skoda =new Car(1995);
        skoda.model ="Skoda Octvia";
        skoda.producer="Skoda";
        skoda.weight = 1574.0;
        skoda.doors =5;
        skoda.value=4000.0;
        skoda.year=1996;



        Human dominika =new Human("Dominika","Migus");
        Human sister = new Human("Zuzia", "Migus");
        dominika.pet=dog;
        dominika.telefon=motorola;

        dominika.telefon = new Phone("Apple" );
        sister.cash = 2000.0;

        sister.car = new Car(1995);

        sister.car.sale(sister, dominika, 1500.0);



      //  System.out.println("dominika.telefon "+ dominika.telefon);
      //  System.out.println("sister.telefon " + sister.telefon);
        try {
            dominika.telefon.sale(dominika, sister, 500.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        try {
            dominika.pet.sale(dominika, sister, 500.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        //dodac sprzedaz zwierzat

      //  System.out.println("me.telefon " + sister.telefon);
      //  System.out.println("sister.telefon " + sister.telefon);
        dominika.pet = sister;
        Human brother = new Human("Kasia", "Kowalska");




        Double weightBeforeBreakfast=dog.getWeight();

        dog.feed();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        dog.feed();
        dog.feed(0.5);

        System.out.println("Przytylem "+(dog.getWeight()-weightBeforeBreakfast)+"kg");

        dominika.setSalary(1500.0);
        dominika.getSalary();
        dominika.setCar(skoda);
        dominika.getCar();
        System.out.println(dominika);

        Car fiat = new Car(1995);
        Phone iphone = new Phone("Motorola");
        Device washingmachine = new Device(2021);





    }
}
