package ch08exception;

public class Throws {
    public static void main(String[] args) {
        try{
            String string = str(null);
            System.out.println(string);
        } catch (NullPointerException e){
            System.out.println("예외 처리 : "+e.toString());
        }
    }

    public static String str(String s) throws NullPointerException{
        if(s == null){
            throw new NullPointerException("문자열이 null입니다.");
        }
        return s;
    }
}
