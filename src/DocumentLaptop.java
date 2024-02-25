public class DocumentLaptop extends Laptop{
    String type;

    public DocumentLaptop(String name, int price, String spec, String type) {
        super(name, price, spec);
        this.type = type;
    }
}