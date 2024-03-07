package nested.Local;
public class Animal {
    public void Information() {
        class LocalClass{
            //필드
            String breed = "Pug";

            //생성자
            LocalClass(){}

            //메소드
            public void informBreed(){
                System.out.println("이 동물의 품종은 퍼그입니다.");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.informBreed();
    }
}

class AnimalExample{
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.Information();
    }
}

