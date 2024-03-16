package ch12.Generics;

import java.util.ArrayList;
import java.util.List;

public class C01Generics {
    public static void main(String[] args) {
        AnimalBox<Animal> animal = new AnimalBox<Animal>();
        AnimalBox<Cat> cat = new AnimalBox<Cat>();
        AnimalBox<Dog> dog = new AnimalBox<Dog>();
//        AnimalBox<Laptop> laptop = new AnimalBox<Laptop>(); //에러,
//        AnimalBox<Animal> animal2 = new AnimalBox<Cat>(); //에러, 타입 불일치

        //Box<Animal>은 자신(Animal)과 자손(Cat, Dog)들 담을 수 있음
        animal.add(new Animal());
        animal.add(new Cat()); //자손 가능
        animal.add(new Dog()); //자손 가능
//        animal.add(new Laptop()); //불가능

        //Box<Cat>은 Cat만 담을 수 있음
        cat.add(new Cat());
//        cat.add(new Animal()); //자손이 부모 불가능
//        cat.add(new Dog()); //Dog는 자손이 아니므로 불가능

        //Box<Dog>은 Dog만 담을 수 있음
        dog.add(new Dog());
//        cat.add(new Animal()); //자손이 부모 불가능
//        cat.add(new Cat()); //Cat는 자손이 아니므로 불가능


//        System.out.println(animal); //[Animal, Cat, Dog]
//        System.out.println(cat); //[Cat]
//        System.out.println(dog); //[Dog]

//        feed1(animal); //Box<Animal> 에 저장되어 있는 객체들 출력
        /*
            Animal : 먹는다
            Cat : 먹는다
            Dog : 먹는다
        */
//        feed1(cat); //Box<Animal> 일 때는 에러, Animal 타입만 해당
//        feed1(dog); //Box<Animal> 일 때는 에러, Animal 타입만 해당
        System.out.println();

//        System.out.println(feed2(animal)); //
//        feed2(cat); //Cat : 먹는다
//        feed2(dog); //Dog : 먹는다
//        System.out.println();

        AnimalBox.<Animal>feed3(animal);



        AnimalBox<? extends Animal> animalBox1 = (AnimalBox<? extends Animal>) new AnimalBox<Animal>();
        AnimalBox<? extends Animal> animalBox2 = new AnimalBox<Cat>();
        AnimalBox<Cat> animalBox3 = (AnimalBox<Cat>) animalBox2; //실행 Ok, 경고 발생


        AnimalBox<? extends Object> objbox = null;
        AnimalBox<? extends Animal> strbox = null;

        strbox = (AnimalBox<? extends Animal>) objbox;
        objbox = (AnimalBox<? extends Object>) strbox;

    }

}




class AnimalBox<T extends Animal> extends Box<T>{
    /* 와일드 카드 전 */
    static void feed1(AnimalBox<Animal> animal){
        for(int i = 0; i<animal.size(); i++){
            Animal a = animal.get(i);
            System.out.println(a + " : 먹는다"); //animal에 해당하는
        }
    }

    /* 와일드 카드 후 */
    static void feed2(AnimalBox<? extends Animal> animal){
        for(int i = 0; i<animal.size(); i++){
            Animal a = animal.get(i);
            System.out.println(a + " : 먹는다");
        }
    }

    static <T extends Animal> void feed3(AnimalBox<T> animal){
        for(int i = 0; i<animal.size(); i++){
            Animal a = animal.get(i);
            System.out.println(a + " : 먹는다");
        }
    }
}
class Box<T>{
    ArrayList<T> list = new ArrayList<>();
    void add(T t) {list.add(t);}
    T get(int i) {return list.get(i);}
    int size() {return list.size();}
    public String toString(){return list.toString();}
}

class Animal{
    @Override
    public String toString() {
        return "Animal";
    }
}
class Cat extends Animal{
    @Override
    public String toString() {
        return "Cat";
    }
}
class Dog extends Animal{
    @Override
    public String toString() {
        return "Dog";
    }
}
class Laptop {
    @Override
    public String toString() {
        return "Laptop";
    }
}