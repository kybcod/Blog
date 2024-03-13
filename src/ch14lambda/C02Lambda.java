package ch14lambda;

public class C02Lambda {
    static void aMethod(C02MyLambda l){ //매개변수의 타입이 함수형 인터페이스
        l.method();
    }

    static C02MyLambda getMyLambda(){ //반환 타입이 함수형 인터페이스
        C02MyLambda l = () -> System.out.println("l2.aMethod()");
        return l;
//       return () -> System.out.println("l2.aMethod()");
    }

    public static void main(String[] args) {
        C02MyLambda l1 = () -> System.out.println("l1.aMethod()");
        aMethod(l1);
        aMethod(() -> System.out.println("l1.aMethod()"));

        C02MyLambda l2 = getMyLambda();
        l2.method();
    }
}


interface C02MyLambda{
    void method();
}