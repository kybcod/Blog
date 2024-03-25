package ch06Inheritance;

public class C02Interface {
    public static void main(String[] args) {
        Animal2 dog2 = new Dog2();

        dog2.sound(); // 출력: 멍멍
//        dog2.bark(); // 참조 타입이 인터페이스이므로 인터페이스 메서드만 호출 가능
    }
}

interface Animal2 {
    void sound();
}

class Dog2 implements Animal2 {
    @Override
    public void sound(){
        System.out.println("멍멍");
    }

    public void bark(){
        System.out.println("왈왈");
    }
}

class Cat implements Animal2 {
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    public void meow() {
        System.out.println("야옹야옹");
    }
}
