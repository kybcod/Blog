package ch10.ch10Calendar;

public class C02Difference {
    public static void main(String[] args) {
        String date1 = "202002";
        String date2 = "202112";

        int year1 = Integer.parseInt(date1.substring(0,4));
        int year2 = Integer.parseInt(date2.substring(0,4));

        int month1 = year1 * 12 + Integer.parseInt(date1.substring(4));
        int month2 = year2 * 12 + Integer.parseInt(date2.substring(4));

        System.out.println("두 날짜 간의 년 차이 : " + Math.abs(year2-year1));
        System.out.println("두 날짜 간의 월 차이 = " + Math.abs(month2-month1));
    }
}
