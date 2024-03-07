package abstractA;

public class AbstractAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        animalSound(new Dog());
        animalSound(new Cat());
    }

    private static void animalSound(Animal animal) {
        animal.sound();
    }

    abstract static class Animal {
        //추상 메소드 선언
        public abstract void sound();
    }

    static class Cat extends Animal {

        //추상 메소드 재정의
        @Override
        public void sound() {
            System.out.println("야옹");
        }
    }

    static class Dog extends Animal {
        //추상 메소드 재정의
        @Override
        public void sound() {
            System.out.println("멍멍");
        }
    }
}


