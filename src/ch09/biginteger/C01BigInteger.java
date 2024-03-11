package ch09.biginteger;

import java.math.BigInteger;

public class C01BigInteger {
    public static void main(String[] args) {
        // BigInteger 객체 생성
        BigInteger num1 = new BigInteger("123456789012345678901234567890");
        BigInteger num2 = new BigInteger("987654321098765432109876543210");

        // 덧셈 연산
        BigInteger sum = num1.add(num2);
        System.out.println("덧셈 결과: " + sum);

        // 뺄셈 연산
        BigInteger difference = num1.subtract(num2);
        System.out.println("뺄셈 결과: " + difference);

        // 곱셈 연산
        BigInteger mul = num1.multiply(num2);
        System.out.println("곱셈 결과 = " + mul);

        // 나눗셈 연산
        BigInteger did = num1.divide(num2);
        System.out.println("나눗셈 결과 = " + did);

        // 나머지 연산
        BigInteger re = num1.remainder(num2);
        System.out.println("나머지 결과 = " + re);
    }
}
