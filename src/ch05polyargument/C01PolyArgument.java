package ch05polyargument;

public class C01PolyArgument {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Audio());
        b.summary();
    }
}


class Prodcut{
    int price;
    int bonusPoint;

    public Prodcut(int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }
    Prodcut(){}
}

class Tv extends Prodcut{

    Tv() { super(100);}

    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer extends Prodcut{
    Computer() {super(200);}

    @Override
    public String toString() {
        return "Computer";
    }

}

class Audio extends Prodcut{
    Audio() {super(200);}

    @Override
    public String toString() {
        return "Audio";
    }

}

class Buyer{
    int money = 1000;
    int bonusPoint = 0;
    Prodcut[] item = new Prodcut[10];
    int i = 0;
    void buy(Prodcut p){
        if(money<p.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++]=p;
        System.out.println(p+"을/를 구입하셨습니다.");
    }

    void summary(){
        int sum = 0;
        String itemList = "";

        for(int i = 0; i< item.length; i++){
            if(item[i]==null) break;
            sum+=item[i].price;
            itemList += item[i] + ",";
        }
        System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
        System.out.println("구입하신 제품은 "+itemList+"입니다.");
    }

}