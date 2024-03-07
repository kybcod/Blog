package nested.InstanceMember;
public class Animal {

    class Behavior{

        //인스턴스 필드
        int weight = 100;

        //인스턴스 생성자
        Behavior(){}

        //인스턴스 메소드
        public void move(){
            System.out.println("동물이 움직인다.");
        }

        public void sound(){
            System.out.println("동물 소리");
        }
    }
}

class AnimalExample{
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal.Behavior behavior = animal.new Behavior();
        System.out.println(behavior.weight+"kg");
        behavior.move();
        behavior.sound();
    }
}

