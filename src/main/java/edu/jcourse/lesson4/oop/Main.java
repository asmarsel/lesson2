package edu.jcourse.lesson4.oop;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Vehicle miniVan = new Vehicle();
        miniVan.passengers = 7;
        miniVan.tank = 70;
        miniVan.fuelPer100km = 8.5F;
        miniVan.name = "Mini Van";
        miniVan.distance();



        Vehicle sportCar = new Vehicle();
        sportCar.passengers = 2;
        sportCar.tank = 50;
        sportCar.fuelPer100km = 18.5F;
        sportCar.name = "Sport Car";
        sportCar.distance();
    }
}
