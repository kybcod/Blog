package ch11.Hash;

import java.util.*;

public class C02HashSet {
    public static void main(String[] args) {
        Set set = new HashSet();

        for(int i = 0; set.size()<6; i++){
            int num = (int)(Math.random()*45)+1;
            set.add(num);
        }
        System.out.println(set);

        List list = new LinkedList(set);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list); //내림차순 정렬
    }
}
