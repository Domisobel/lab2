package com.company;


import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Phone motorola=new Phone("Motorola");
        motorola.os="Motorola";
        Animal dog = new Animal("canis");
        Animal cat = new Animal("felis");
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
        dominika.pet=dog;
        dominika.telefon=motorola;





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