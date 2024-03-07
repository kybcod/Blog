package nested.NestedInterface;
public class Animal {
    public interface Behavior{
        void move();
        void sound();
    }

     static class Dog implements Behavior{
        @Override
        public void move() {
            System.out.println("Dog가 움직이고 있다.");
        }

        @Override
        public void sound() {
            System.out.println("멍멍");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();;
        dog.move();
        dog.sound();
    }
}

