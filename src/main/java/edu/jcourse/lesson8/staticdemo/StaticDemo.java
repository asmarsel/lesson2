package edu.jcourse.lesson8.staticdemo;

public class StaticDemo {

    public static void main(String[] args) {
        float r = 20;
        float circleArea = MathConstants.PI * (r * r);

        System.out.println("Circle Area: " + circleArea);
        System.out.println(MathConstants.sum(10, 20));
    }
}
