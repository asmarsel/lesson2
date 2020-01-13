package edu.jcourse.lesson8.staticdemo;

public class MathConstants {

    static {
        System.out.println("Message");
    }

    public static final float PI = 3.14F;

    public static float sum(float a, float b) {
     return a + b;
    }
}
