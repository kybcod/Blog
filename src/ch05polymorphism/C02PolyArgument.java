package ch05polymorphism;

public class C02PolyArgument {
    public static void main(String[] args) {
        Tv tv = new Tv();
        CationTv c = new CationTv();
        CationTv c1 = (CationTv) tv; //다운캐스팅(형변환 생략불가)
        Tv tv1 = new CationTv(); //업캐스팅(생략) Tv tv1 = (Tv) new CationTv();

        tv1.channel = 1;
        System.out.println("채널 " + tv1.channelUp()+"으로 변경합니다.");

    }
}

class Tv{
    boolean power;
    int channel;

    void power(){power = !power;}
    int channelUp(){return ++channel;}
    int channelDown(){return --channel;}

}

class CationTv extends Tv{
    String text;
    void caption(){}
}

