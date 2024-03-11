package ch10.ch10Calendar;

import java.text.DecimalFormat;

public class C04DecimalFormat {
    public static void main(String[] args) {
        double num = 12.34;

        DecimalFormat df1 = new DecimalFormat("0.00");
        System.out.println(df1.format(num)); //12.34

        DecimalFormat df2 = new DecimalFormat("###.#");
        System.out.println(df2.format(num)); //12.3
    }
}
