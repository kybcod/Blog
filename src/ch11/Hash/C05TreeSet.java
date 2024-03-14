package ch11.Hash;

import java.util.TreeSet;

public class C05TreeSet {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        String from = "b";
        String to = "d";

        set.add("abc"); set.add("alien"); set.add("bat");
        set.add("car"); set.add("Car"); set.add("disc");
        set.add("dzzzz"); set.add("dZZZZ"); set.add("fan");

        System.out.println(set);
        System.out.println("from = " + from+", to = "+to);
        System.out.println("set.subSet(b,d) = " + set.subSet(from,to));
        System.out.println("set.subSet(b,d) = " + set.subSet(from,to+"zzz"));

        TreeSet set1 = new TreeSet();
        int[] scores = {40,30,80,90,95,85,75};

        for (int i = 0; i<scores.length;i++){
            set1.add(scores[i]);
        }
        System.out.println("50보다 작은 값 : "+set1.headSet(50));
        System.out.println("50보다 큰 값 : "+set1.tailSet(50));
    }
}
