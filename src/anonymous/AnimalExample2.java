package anonymous;

public class AnimalExample2 {
    public static void main(String[] args) {
        Animal2 animal = new Animal2(){
            @Override
            public void eat(){
                System.out.println("사료를 먹는다");
            }
        };
        animal.eat(); //출력 : 멍멍
    }
}

interface Animal2{
    public void eat();
}
