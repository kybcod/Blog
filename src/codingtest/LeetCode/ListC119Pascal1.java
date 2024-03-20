package codingtest.LeetCode;

import java.util.*;

public class ListC119Pascal1 {
    public static void main(String[] args) {
        int rowIndex = 3;

        List<Integer> list = new ArrayList<>();
        for(int row = 0; row <= rowIndex; row++){
            list.add(0,1);
            for(int i = 1; i<row; i++){
                list.set(i, list.get(i)+list.get(i+1));
            }
        }

        System.out.println(list);
    }
}
