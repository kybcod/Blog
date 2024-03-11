package ch08exception;

public class ExceptionHanding {
    public static void main(String[] args) {
        try {
            String str = null; // 예외 발생 가능한 코드
            System.out.println(str.length()); // NullPointerException 발생
        } catch (ArithmeticException | NumberFormatException | NullPointerException e) {
            System.out.println(" 예외 발생: " + e.toString());
        }

        try {
            String str = null; // 예외 발생 가능한 코드
            System.out.println(str.length()); // NullPointerException 발생
        }catch (ArithmeticException e) {
            System.out.println("예외 발생: " + e.toString());
        }catch (NumberFormatException e) {
            System.out.println("예외 발생: " + e.toString());
        }catch (NullPointerException e) {
            System.out.println("예외 발생: " + e.toString());
        }

    }
}
