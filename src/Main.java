public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new GamingLaptop("Samsung Laptop", 2_000_000, "게임용 노트북","graphicsCard");
        Laptop laptop2 = new DocumentLaptop("LG Laptop", 1_000_000, "문서 작성용 노트북","Document");

        laptop1.bootUp(); // 출력: "Windows laptop is booting up..."
        laptop2.bootUp(); // 출력: "Macbook is booting up..."

    }
}