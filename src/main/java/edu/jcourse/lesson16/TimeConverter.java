package edu.jcourse.lesson16;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TimeConverter {

    private static final String DT_PATTERN = "dd.MM.yyyy HH:mm";
    private static final DateTimeFormatter DT_FORMATTER = DateTimeFormatter.ofPattern(DT_PATTERN);
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ZoneId departureZone = askZone("Enter departure zone");
        LocalDateTime departureDT = askDateTime("Enter departure date and time");

        ZoneId destinationZone = askZone("Enter destination zone");
        LocalDateTime destinationDT = askDateTime("Enter destination date and time");

        ZonedDateTime departure = ZonedDateTime.ofLocal(departureDT, departureZone, null);
        ZonedDateTime destination = ZonedDateTime.ofLocal(destinationDT, destinationZone, null);

        Duration duration = Duration.between(departure, destination);

//        System.out.println(duration);

        long seconds = duration.getSeconds();
        long hours = seconds / 3600;
        long minutes = (seconds / 60) % 60;

        System.out.printf("Flight's duration is %d hours and %d minutes%n", hours, minutes);
    }

    private static LocalDateTime askDateTime(String msg) {
        for (; ; ) {
            System.out.println(msg);
            System.out.println("format:" + DT_PATTERN);
            System.out.print("> ");
            String answer = scanner.nextLine();
            try {
                return LocalDateTime.parse(answer, DT_FORMATTER);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date/time");
            }
        }
    }

    private static ZoneId askZone(String msg) {
        for (; ; ) {
            System.out.println(msg);
            System.out.println("enter 'help' for all available zones");
            System.out.print("> ");
            String answer = scanner.nextLine();
            if ("help".equals(answer)) {
                System.out.println(String.join(",", ZoneId.getAvailableZoneIds()));
                continue;
            }
            try {
                return ZoneId.of(answer);
            } catch (DateTimeException e) {
                System.out.println("Unknown time zone");
            }
        }
    }
}