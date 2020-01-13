package edu.jcourse.apps.guessnum;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Random random = new Random();

        LeaderBoard leaders = new LeaderBoard();
        leaders.load();

        while (true) {
            int myNum = random.nextInt(100) + 1;
//            leaders.print();
            System.out.println(myNum);

            System.out.println("What is your name?");
            String name = scanner.next();

            long gameStart = System.currentTimeMillis();

            boolean isLooser = true;
            for (int i = 0; i < 10; i++) {
                int userNum = askNum(i + 1);
                if (userNum == myNum) {
                    long gameEnd = System.currentTimeMillis();
                    GameResult res = new GameResult();
                    res.setName(name);
                    res.setTriesCount(i + 1);
                    res.setTime(gameEnd - gameStart);
                    leaders.add(res);
                    isLooser = false;
                    System.out.println("You win!");
                    break;
                }
                if (userNum > myNum) {
                    System.out.println("My num is less than yours");
                } else {
                    System.out.println("My num is greater than yours");
                }
            }
            if (isLooser) {
                System.out.println("You lost, my friend, the number was " + myNum);
            }
            System.out.println("Do you want to play new game? (y/n)");
            String answer = scanner.next();
            if (answer.equals("n")) {
                break;
            }
        }

        leaders.print1();
        leaders.save();

        System.out.println("Goodbye!");
    }

    static int askNum(int tryNr) {
        while (true) {
            try {
                System.out.printf("Try #%d. Enter your number: ", tryNr);
                int num = scanner.nextInt();
                if (num < 0 || num > 100) {
                    System.out.println("You have to enter number from 1 to 100");
                } else {
                    return num;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Oh! It isn't a number");
                scanner.next();
            }
        }
    }
}