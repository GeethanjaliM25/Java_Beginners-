package com.mit.sam;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {

    public static void main(String[] args) {

        // Current time
        LocalTime t1 = LocalTime.now();
        System.out.println(t1);

        // Create time using hour and minute
        LocalTime t2 = LocalTime.of(6, 30);
        System.out.println(t2);

        // Parse time from String
        LocalTime t3 = LocalTime.parse("09:15");
        System.out.println(t3);

        // Add 1 hour
        System.out.println(t2.plus(1, ChronoUnit.HOURS));

        // Get hour
        System.out.println(t3.getHour());

        // Maximum LocalTime
        System.out.println(LocalTime.MAX);

        // Current time in milliseconds
        System.out.println(System.currentTimeMillis());
    }
}