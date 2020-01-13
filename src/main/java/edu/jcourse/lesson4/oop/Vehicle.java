package edu.jcourse.lesson4.oop;

class Vehicle {
    String name;
    int passengers;
    int tank;
    float fuelPer100km;

    Vehicle() {}

    public Vehicle(String name, int passengers, int tank, float fuelPer100km) {
        this.name = name;
        this.passengers = passengers;
        this.tank = tank;
        this.fuelPer100km = fuelPer100km;
    }

    void distance() {
        float distance = (tank * 100) / fuelPer100km;
        System.out.println("Distance: for " + name + " is " + distance + " km");
    }
}