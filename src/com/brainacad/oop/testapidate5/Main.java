package com.brainacad.oop.testapidate5;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Created by User on 02.05.2018.
 */
public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);
        LocalDate birthDate = LocalDate.of(1968, 9, 17);
        System.out.println("Date of birth: " + birthDate);

        System.out.println("My years: " + birthDate.until(currentDate).getYears());

        System.out.println("I was born on " + birthDate.getDayOfWeek());
        LocalDate thisYearBirthday = LocalDate.now().withMonth(9).withDayOfMonth(17);
        System.out.println("This year my birthday will be on " +
                thisYearBirthday.getDayOfWeek());

        if (Period.between(currentDate, thisYearBirthday).isNegative()) {
            System.out.println("This year my birthday passed");
        } else {
            System.out.println("This year my birthday not passed");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy, HH-mm-ss");

        LocalDateTime tokyo = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("Asia/Tokyo"));
        LocalDateTime london = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/London"));
        LocalDateTime newYork = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("America/New_York"));

        System.out.println("Tokyo " + formatter.format(tokyo));
        System.out.println("London " + formatter.format(london));
        System.out.println("New-York " + formatter.format(newYork));
    }
}
