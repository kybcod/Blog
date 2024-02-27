public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Samsung Laptop", -2_000_000, "게임용 노트북");
        GamingLaptop glaptop = new GamingLaptop("Samsung Laptop", 2_000_000, "게임용 노트북","graphicsCard");
        DocumentLaptop dlaptop = new DocumentLaptop("LG Laptop", 1_000_000, "문서 작성용 노트북","Document");

//        Laptop laptops = new GamingLaptop("Samsung Laptop", 2_000_000, "게임용 노트북","graphicsCard"); //자동 타입 변환
//        GamingLaptop glaptop = (GamingLaptop) laptops;  //강제 타입 변환


//        System.out.println(laptop.getPrice()); //RuntimeException
        glaptop.POWERUp(); // 출력: "GamingLaptop is booting up..."
        dlaptop.bootUp(); // 출력: "DocumentLaptop is booting up..."
        laptop.bootUp();
        glaptop.bootUp();

    }
}