public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Samsung Laptop", -2_000_000, "게임용 노트북");
        GamingLaptop glaptop = new GamingLaptop("Samsung Laptop", 2_000_000, "게임용 노트북","graphicsCard");
        DocumentLaptop dlaptop = new DocumentLaptop("LG Laptop", 1_000_000, "문서 작성용 노트북","Document");

//        System.out.println(laptop.getPrice()); //RuntimeException
        glaptop.bootUp(); // 출력: "GamingLaptop is booting up..."
        dlaptop.bootUp(); // 출력: "DocumentLaptop is booting up..."

    }
}