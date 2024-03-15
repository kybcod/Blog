package ch12.Generics;

import java.util.ArrayList;
import java.util.List;

public class C02Generics {
    public static void main(String[] args) {
        List<Animal2> animal = new ArrayList<Animal2>();
        List<Cat2> cat = new ArrayList<Cat2>();
        List<Dog2> dog = new ArrayList<Dog2>();
        List<Laptop2> laptop = new ArrayList<Laptop2>();
//        List<Animal> animal2 = new ArrayList<Cat>(); //에러, 타입 불일치


        //Box<Animal>은 자신(Animal)과 자손(Cat, Dog)들 담을 수 있음
        animal.add(new Animal2());
        animal.add(new Cat2()); //자손 가능
        animal.add(new Dog2()); //자손 가능
//        animal.add(new Laptop2()); //불가능

        //Box<Cat>은 Cat만 담을 수 있음
        cat.add(new Cat2());
//        cat.add(new Animal2()); //자손이 부모 불가능
//        cat.add(new Dog2()); //Dog는 자손이 아니므로 불가능

        //Box<Dog>은 Dog만 담을 수 있음
        dog.add(new Dog2());
//        cat.add(new Animal2()); //자손이 부모 불가능
//        cat.add(new Cat2()); //Cat는 자손이 아니므로 불가능

        //Box<Laptop>은 Laptop만 담을 수 있음
        laptop.add(new Laptop2());
//        laptop.add(new Animal2());
//        laptop.add(new Cat2());
//        laptop.add(new Dog2());

        System.out.println(animal); //[Animal, Cat, Dog]
        System.out.println(cat); //[Cat]
        System.out.println(dog); //[Dog]
        System.out.println(laptop); //[Laptop]
    }

    static void feed(Animal2<? extends Animal2> animal2){


    }

}


class Animal2<T> {
    @Override
    public String toString() {
        return "Animal2";
    }
}
class Cat2 extends Animal2 {
    @Override
    public String toString() {
        return "Cat2";
    }
}
class Dog2 extends Animal2{
    @Override
    public String toString() {
        return "Dog2";
    }
}
class Laptop2{
    @Override
    public String toString() {
        return "Laptop2";
    }
}


