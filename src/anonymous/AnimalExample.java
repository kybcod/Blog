package anonymous;

public class AnimalExample {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void sound(){
                System.out.println("멍멍");
            }
        };

        animal.sound(); //출력 : 멍멍
    }
}

class Animal{
    public void sound(){
        System.out.println("동물 소리를 낸다.");
    }
}
