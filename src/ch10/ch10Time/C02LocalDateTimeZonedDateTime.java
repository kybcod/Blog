package ch10.ch10Time;

import java.time.*;

public class C02LocalDateTimeZonedDateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2001,02,15);
        LocalTime time = LocalTime.of(12,34,56);

        LocalDateTime dt = LocalDateTime.of(date, time);
        System.out.println("dt = " + dt);
        
        ZoneId zid = ZoneId.of("Asia/Seoul");
        ZonedDateTime zdt = dt.atZone(zid);
        System.out.println("zdt = " + zdt);
        
        String strzid = zdt.getZone().getId();
        System.out.println("strzid = " + strzid);

        ZonedDateTime seoulTime = ZonedDateTime.now();
    }
}
