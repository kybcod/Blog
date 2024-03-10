package bigdeciaml;

import java.math.BigDecimal;

public class C01BigDecimal {
    public static void main(String[] args) {
        // BigDecimal 객체 생성
        BigDecimal num1 = new BigDecimal("123.456");
        BigDecimal num2 = new BigDecimal("789.012");

        // 덧셈 연산
        BigDecimal sum = num1.add(num2);
        System.out.println("덧셈 결과: " + sum);

        // 뺄셈 연산
        BigDecimal difference = num1.subtract(num2);
        System.out.println("뺄셈 결과: " + difference);

        // 곱셈 연산
        BigDecimal product = num1.multiply(num2);
        System.out.println("곱셈 결과: " + product);

        // 나눗셈 연산
        BigDecimal quotient = num1.divide(num2, 5, BigDecimal.ROUND_HALF_UP); // 소수점 다섯 번째 자리까지 반올림
        System.out.println("나눗셈 결과: " + quotient);

        // 나머지 연산
        BigDecimal re = num1.remainder(num2);
        System.out.println("나머지 결과: " + re);
    }
}
