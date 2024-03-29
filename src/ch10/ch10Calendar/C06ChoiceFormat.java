package ch10.ch10Calendar;

import java.text.ChoiceFormat;

public class C06ChoiceFormat {
    public static void main(String[] args) {
        double[] limits = {60,70,80,90};
        String[] grades = {"D","C","B","A"};

        int[] scores = {100,95,88,70,52,50,70};

        ChoiceFormat cf = new ChoiceFormat(limits,grades);
        for (int i = 0; i<scores.length; i++){
            System.out.println(scores[i]+":"+cf.format(scores[i]));
        }
    }
}
