package ch10.ch10Calendar;

import java.util.Calendar;

public class C03AddAndRoll {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();

        date.set(2023,3,31);
        System.out.println(toString(date)); //2023년 5월 1일

        date.roll(Calendar.MONTH, 1);
        System.out.println(toString(date)); //2023년 6월 1일, 월 변함

        date.add(Calendar.MONTH, 1);
        System.out.println(toString(date)); //2023년 7월 1일

        date.roll(Calendar.DATE, 31);
        System.out.println(toString(date)); //2023년 7월 1일, 월은 변하지 않음

    }

    public static String toString(Calendar date){
        return date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)+"월 "+date.get(Calendar.DATE)+"일";
    }
}
