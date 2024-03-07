package nested.StaticMember;
public class Animal {
    public static class Information{

        //정적 필드
        static String breed = "Pug";


        //생성자
        Information(){}

        //인스턴스 메소드
        public void informBreed(){
            System.out.println("이 동물의 품종은 퍼그입니다.");
        }

    }
}

class AnimalExample{
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal.Information information = new Animal.Information();
        System.out.println(information.breed);
        information.informBreed();
    }
}

