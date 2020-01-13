package edu.jcourse.lesson3;

public class ArrayDemo {

    public static void main(String[] args) {

        int arraySize = 10;
        int a[] = new int[arraySize];
        int c = 7;

        for (int i = 0; i < a.length; i++) {
            a[i] = i * c;
        }

        for (int v: a) {
            System.out.println(v);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}