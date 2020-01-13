package edu.jcourse.lesson9;

import java.util.Random;

public class GenRandom {

    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomInt = random.nextInt(100) + 1;
            System.out.println(randomInt);
        }
    }
}
