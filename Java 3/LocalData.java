package com.mit.sam;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalData {

    public static void main(String[] args) {

        // =========================
        // 1. CURRENT DATE
        // =========================

        LocalDate d1 = LocalDate.now();
        System.out.println("Today: " + d1);

        // =========================
        // 2. CREATE DATE
        // =========================

        LocalDate d2 = LocalDate.of(2024, 6, 1);
        System.out.println("Date: " + d2);

        // =========================
        // 3. PARSE DATE
        // =========================

        LocalDate d3 = LocalDate.parse("2024-06-01");
        System.out.println("Parsed Date: " + d3);

        // =========================
        // 4. DATE OPERATIONS
        // =========================

        System.out.println("Tomorrow: " + d1.plusDays(1));

        System.out.println(
                "One month before: " +
                        d1.minus(1, ChronoUnit.MONTHS));

        System.out.println("Day of Week: " + d2.getDayOfWeek());

        System.out.println("Day of Year: " + d3.getDayOfYear());

        System.out.println("Is Leap Year: " + d1.isLeapYear());

        // =========================
        // 5. AGE CALCULATION
        // =========================

        LocalDate dob = LocalDate.of(2005, 6, 15);

        long age = ChronoUnit.YEARS.between(dob, d1);

        System.out.println("Date of Birth: " + dob);
        System.out.println("Age: " + age);
    }
}