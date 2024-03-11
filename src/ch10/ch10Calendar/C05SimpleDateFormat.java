package ch10.ch10Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C05SimpleDateFormat {
    public static void main(String[] args) {
        String dateString = "2024/03/11";

        // 날짜 형식의 문자열을 Date 객체로 파싱
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date date = dateFormat.parse(dateString);
            String date2 = dateFormat.format(date);
            System.out.println("날짜: " + date2); // 출력 - 날짜: 2024/03/11
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}

