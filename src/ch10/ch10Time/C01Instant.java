package ch10.ch10Time;

import java.time.Instant;

public class C01Instant {
    public static void main(String[] args) {
        Instant now = Instant.now();
        Instant now1 = Instant.ofEpochSecond(now.getEpochSecond());
        Instant now2 = Instant.ofEpochSecond(now.getEpochSecond(), now.getNano());

        System.out.println("now = " + now); //2024-03-11T08:18:55.801392700Z
        System.out.println("now1 = " + now1); //2024-03-11T08:18:55Z
        System.out.println("now2 = " + now2); //2024-03-11T08:18:55.801392700Z

    }
}
