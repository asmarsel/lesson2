package edu.jcourse.lesson12;

import java.util.ArrayList;
import java.util.List;

public class SimpleTask {

    public static void main(String[] args) {
        /*
        ClassA a = new ClassA();
        a.printMessage();

        ClassB b = new ClassB();
        b.printMessage();

        ClassC c = new ClassC();
        c.printMessage();

        CircleAreaService circle = new CircleAreaServiceImpl();
        System.out.println(circle.calcCircleArea(23));

        CircleAreaService rectangle = new CircleAreaServiceImpl();
        System.out.println(rectangle.calcRectangleArea(8 ,9));
         */

        ArrayList<String> emails = new ArrayList<>();
        emails.add("john.doe@gmail.com");
        emails.add("zane.celotaja@apollo.lv");
        emails.add("albert.kartinov@inbox.lv");

        FileService myFileService = new FileServiceImpl();
        myFileService.createFile("emails.txt", emails);


    }
}