package ch10.ch10Calendar;

import java.text.MessageFormat;

public class C07MessageFormat {
    public static void main(String[] args) {
        String msg = "Name : {0} \nTel : {1} \nAge : {2}";
        Object[] arg = {"김자바", "010-123","22"};

        String result = MessageFormat.format(msg,arg);
        System.out.println(result);
    }
}
