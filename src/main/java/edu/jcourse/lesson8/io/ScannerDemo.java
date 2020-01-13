package edu.jcourse.lesson8.io;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(
                "First String,\n" +
                        "Second String,\n" +
                        "Third String");

        System.out.println("Application started.");
        Scanner stringScanner = new Scanner(System.in);
        System.out.println("A: " + stringScanner.next());
        System.out.println("Sum: " + stringScanner.next());

//        while (scanner.hasNext()){
//            System.out.println(scanner.nextLine());
//        }
//
//        String s = scanner.nextLine();
//        System.out.println(s);
//        String s1 = scanner.nextLine();
//        System.out.println(s1);
//
    }
}
