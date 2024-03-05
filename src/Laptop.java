public class Laptop implements Control {

    private int volume;
    private String name;
    private double price;
    private String spec;

    private int memoryVolume;


    // 생성자
    public Laptop() {

    }
    public Laptop(String name, int price, String spec) {
        this.name = name;
        this.price = price;
        this.spec = spec;
    }

    // getter와 setter 메서드
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        if (price < 0){
            throw new RuntimeException();
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    // 가격 업데이트 메서드 오버로딩
    public void updatePrice(int newPrice) {
        this.price = newPrice;
        System.out.println("새로운 가격 : " + newPrice + "원");
    }

    // 가격 업데이트 메서드 오버로딩
    public void updatePrice(double discountPercentage, boolean isSale) {
        double discountedPrice = price - (price * discountPercentage / 100);
        if (isSale) {
            System.out.println("할인 중입니다. 가격은" + discountedPrice + "입니다.");
        } else {
            System.out.println("할인이 적용되지 않았습니다.");
        }
    }

    @Override
    public void turnOn(){
        System.out.println("컴퓨터를 켭니다.");
    }

    @Override
    public void turnOff(){
        System.out.println("컴퓨터를 끕니다.");
    }

    @Override
    public void setVolume(int volume){
        if(volume>Control.MAX_VOLUME){
            this.volume = Control.MAX_VOLUME;
        } else if(volume < Control.MIN_VOLUME){
            this.volume = Control.MIN_VOLUME;
        } else{
            this.volume = volume;
        }
        System.out.println("현재 볼륨 : " + this.volume);
    }

    @Override
    public void setMute(boolean mute){
        if(mute){
            this.memoryVolume = this.volume;
            System.out.println("무음 처리합니다.");
            setVolume(Control.MIN_VOLUME);
        }else {
            System.out.println("무음 해제합니다.");
            setVolume(this.memoryVolume);
        }

    }

    @Override
    public void bootUp() {
        System.out.println("Laptop is booting up...");
    }
}









