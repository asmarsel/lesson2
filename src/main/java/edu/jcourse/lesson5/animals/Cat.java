package edu.jcourse.lesson5.animals;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {}

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println(getName() + " says Meow");
    }
}