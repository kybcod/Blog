package ch10.ch10Time;

import java.time.LocalDate;
import java.time.LocalTime;

public class C01LocalDateLocalTIme {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println("date = " + date); //date = 2024-03-11
        System.out.println("time = " + time); //time = 16:57:13.981909

        LocalDate date1 = LocalDate.of(2001,02,15);
        LocalTime time1 = LocalTime.of(02,34,54);

        System.out.println("date1 = " + date1); //date1 = 2001-02-15
        System.out.println("time1 = " + time1); //time1 = 02:34:54
    }
}
