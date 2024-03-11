package ch08exception;

public class Custom {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();

        try{
            l1.bootUp();
        }catch (BoootingException e){
            System.out.println("예외 발생 : "+e.getMessage());
        }

    }
}


class BoootingException extends RuntimeException{
    public BoootingException(){}

    public BoootingException(String message){
        super(message);
    }
}

class Laptop{
    public void bootUp(){
        throw  new BoootingException("부팅을 실패했습니다.");
    }
}
