package ch09.StringBuffer;

public class C03StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hi");
        sb1.append(" Java").append(" python");
        System.out.println("sb1 = " + sb1); //Hi Java python

        StringBuilder sb2 = sb1.deleteCharAt(2);
        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2);

        System.out.println("sb1.capacity() = " + sb1.capacity());
        System.out.println("sb1.length() = " + sb1.length());


        System.out.println("sb1.insert(7,'-') = " + sb1.insert(7,'-'));
        System.out.println("sb1.reverse() = " + sb1.reverse());

        StringBuilder b1 = new StringBuilder("Hello");
        StringBuilder b2 = new StringBuilder("Hello");
        System.out.println(b1.equals(b2)); // 출력: false (참조가 다름)

        String s1 = b1.toString();
        String s2 = b2.toString();
        System.out.println(s1.equals(s2)); // 출력: false (문자열 같음)


    }
}
