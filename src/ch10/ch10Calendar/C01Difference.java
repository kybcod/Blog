package ch10.ch10Calendar;

import java.util.Calendar;

public class C01Difference {
    public static void main(String[] args) {
        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();

        time1.set(Calendar.HOUR_OF_DAY, 11); //11시 11분 11초
        time1.set(Calendar.MINUTE, 11);
        time1.set(Calendar.SECOND, 11);

        time2.set(Calendar.HOUR_OF_DAY, 10); //10시 10분 10초
        time2.set(Calendar.MINUTE, 10);
        time2.set(Calendar.SECOND, 10);

        long difference = Math.abs(time2.getTimeInMillis()-time1.getTimeInMillis())/1000;
        System.out.println("difference = " + difference); //3660
    }
}
