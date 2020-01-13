package edu.jcourse.lesson5.animals;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {}

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println(getName() + " says Gav");
    }
}