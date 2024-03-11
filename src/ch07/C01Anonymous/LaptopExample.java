package ch07.C01Anonymous;


public class LaptopExample {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(){
            @Override
            public void bootUp() {
                System.out.println("부팅 중입니다.");
            }
        };
        laptop.bootUp();
    }
}

interface Laptop{
    public void bootUp();
}
