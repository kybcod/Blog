public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Samsung Laptop", -2_000_000, "게임용 노트북");
        Laptop laptop1 = new GamingLaptop("Samsung Laptop", 2_000_000, "게임용 노트북","graphicsCard");
        Laptop laptop2 = new DocumentLaptop("LG Laptop", 1_000_000, "문서 작성용 노트북","Document");

        System.out.println(laptop.getPrice()); //RuntimeException
        laptop1.bootUp(); // 출력: "GamingLaptop is booting up..."
        laptop2.bootUp(); // 출력: "DocumentLaptop is booting up..."

    }
}