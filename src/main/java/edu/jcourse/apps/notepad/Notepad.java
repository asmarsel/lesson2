package edu.jcourse.apps.notepad;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Notepad {
    public static final String STR_TIME_PATTERN = "HH:mm";
    public static final DateTimeFormatter TIME_PATTERN = DateTimeFormatter.ofPattern(STR_TIME_PATTERN);
    public static final String STR_DAY_PATTERN = "yyyy:MM:dd";
    public static final DateTimeFormatter DAY_PATTERN = DateTimeFormatter.ofPattern(STR_DAY_PATTERN);
    static final Scanner scanner = new Scanner(System.in);
    static final ArrayList<InfoAbout> records = new ArrayList<>();


    public static void main(String[] args) {

        while (true) {
            System.out.print("enter command>");
            String cmd = scanner.next();
            switch (cmd) {
                case "help":
                    help();
                    break;
                case "exit":
                    System.out.println("goodbye!");
                    return;
                case "create":
                    createRecord();
                    break;
                case "list":
                    list();
                    break;

                default:
                    System.out.println("error: unknown command!");
            }
        }
    }

    static void help() {
        System.out.println("helping tips:\n try typing --> \"exit\" or \"record\"");
    }

    static void createRecord() {
        String type = askString("enter type:");
        switch (type) {
            case "person":
                create(new PersonRecord());
                break;
            case "note":
                create(new NoteRecord());
                break;
            case "alarm":
                create(new AlarmRecord());
                break;
            case "reminder":
                create(new ReminderRecord());
                break;
            default:
                System.out.println("error: unknown type");
        }
    }

    private static void create(InfoAbout aRecord) {
        aRecord.askData();
        records.add(aRecord);

        System.out.println("Created!");
        System.out.println(aRecord);
    }

    /*
   static void createPerson() {
        PersonRecord record = new PersonRecord();
        record.askData();

        records.add(record);

//        System.out.println("contact created!");
    }

    static void createNote() {
        NoteRecord text = new NoteRecord();
        text.askData();

        records.add(text);

//        System.out.println("note created!");
    }           */

    static void list() {
        for (InfoAbout r : records) {
            System.out.println(r);
        }
    }

    static String askString(String message) {
        System.out.print(message);
        return scanner.next();
    }

    public static LocalTime askTime(String message) {
        String strTime = askString(message + " " + STR_TIME_PATTERN + " ");
        return LocalTime.parse(strTime, TIME_PATTERN);
    }

    public static LocalDate askDate(String message) {
        String strDate = askString(message + " " + STR_DAY_PATTERN + " ");
        return LocalDate.parse(strDate, DAY_PATTERN);
    }
}