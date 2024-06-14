package com.OCJA.Practise;

import org.springframework.boot.autoconfigure.web.format.DateTimeFormatters;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateAndTimeAPI
{
    public static void main(String[] args)
    {
        LocalDate a = LocalDate.of(1993,12,07);
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime b = LocalDateTime.of(1993,12,07,12,12,12);
        LocalDate parse = LocalDate.parse("1993-12-07");

        ZoneId f = ZoneId.of("America/Los_Angeles");
        ZonedDateTime e = ZonedDateTime.now(f);
        System.out.println(parse);

        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;






    }
}
