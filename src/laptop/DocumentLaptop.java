package laptop;

public class DocumentLaptop extends Laptop implements Control {
    String type;

    public DocumentLaptop(){

    }
    public DocumentLaptop(String name, int price, String spec, String type) {
        super(name, price, spec);
        this.type = type;
    }

    @Override
    public void bootUp() {
        System.out.println("DocumentLaptop is booting up...");
    }
}