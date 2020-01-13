package edu.jcourse.lesson3;

public class Conversion {
    public static void main(String[] args) {
        byte bVar = 10;
        int iVar = bVar * 20;

        long lVar;
        double dVar;

        lVar = 10_000;
        dVar = lVar;

        System.out.println("LVar and DVar: " + lVar + " " + dVar);
        double x, y;
        byte b;
        int i;
        char ch;

//        x = 10.0;
//        y = 3.0;
//        System.out.println("x/y: " + x/y);
//        i = (int) (x/y);
//        System.out.println("x/y: " + i);
//
//        i = 257;
//        b = (byte) i;
//        System.out.println("b: " + b);

        int iChar = 10086;
        ch = (char) iChar;
        System.out.println("ch from i: " + ch);
    }
}
