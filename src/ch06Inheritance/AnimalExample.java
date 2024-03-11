package ch06Inheritance;

public class AnimalExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound(); //출력 : 동물 소리

        Dog dog = new Dog();
        dog.sound(); //출력 : 멍멍

        Animal animal1 = new Dog(); //개는 동물이다.(new Dog() :인스턴스)
        animal1.sound(); //출력 : 멍멍
    }
}

class Animal{
    public void sound(){
        System.out.println("동물 소리");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("멍멍");
    }
}
