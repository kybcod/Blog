package ch09.bigdeciaml;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class C02BigDecimal {
    public static void main(String[] args) {
        BigDecimal value = new BigDecimal("123.456789");

        // 소수점 이하 자릿수를 2자리로 설정 (반올림)
        BigDecimal result1 = value.setScale(2);
        System.out.println("Result 1: " + result1); // 출력 결과: 123.46

        // 소수점 이하 자릿수를 2자리로 설정하면서 반올림 모드를 지정
        BigDecimal result2 = value.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Result 2: " + result2); // 출력 결과: 123.46
    }
}
