package com.company.creatures;


import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {

    private static final Double DEFAULT_SALARY = 1600.0;
    public Car car;


    String firstName;
    String lastName;
    public Animal pet;
    public Phone telefon;
    private String device;
    private Double salary;
    public double cash;

    public Human(String firstName, String lastName) {
        super("homo sapiens");

        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = DEFAULT_SALARY;
        this.cash = 0.0;
    }
    public void sale(Human seller, Human buyer, double price) {
        System.out.println("NIE");
    }


    public void setSalary(Double newSalary) {
        if (newSalary >= 0) {
            salary = newSalary;
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");
            System.out.println("Należy odebrać aneks do umowy od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty, nie ma co ukrywać dochodu :)");
        }
        else
        {
            System.out.println("Ujemna wyplata!!");
        }
    }
    public void setCar(Car vehicle)
    {
        if(salary > vehicle.value)
        {
            System.out.println("Udało się kupić samochód za gotówkę!");
            device = vehicle.showCar();
        }
        else if(salary > (vehicle.value/12))
        {
            System.out.println("Udało się kupić samochód na kredyt!");
            device = vehicle.showCar();
        }
        else
        {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę!");
        }
    }

    public Double getSalary(){

        System.out.println("Ostatnie pobieranie danych o wypłacie: 10.09.2021. Wartość: "+ salary+ "zl");
        return this.salary;
    }
    public void getCar()
    {
        System.out.println(this.device);
    }
    //toString
    public String toString()
    {
        return "Imię: " + firstName + " Nazwisko: " + lastName  +" Zwierzę: (" + pet + ") Samochód:( " + device + ") Pensja: " + salary + "Telefon: "+ telefon;
    }


    @Override
    public void feed(double foodWeight) {///wpisac ciało metody, logiczne zagadnienie rozbudowujące -potem

    }
}
