package ch14lambda;

public class C01Lambda {
    public static void main(String[] args) {
        C01LambdaInterface obj = (int a, int b) ->{
            System.out.println(a>b?a:b);
        };
        obj.max(3,2);
    }
}

@FunctionalInterface
interface C01LambdaInterface{
    void max(int a, int b);
}

