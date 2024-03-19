package codingtest.LeetCode;

import java.util.*;

public class C119PascalTriangle1 {
    public static void main(String[] args) {
        int rowIndex = 3;

        List<Integer> list = new ArrayList<>();
        for(int row = 0; row <= rowIndex; row++){
//            list.add(0,1);
            for(int i = 1; i<row; i++){
                if(i == 0)
                    list.add(0);
                else list.set(i, list.get(i)+list.get(i+1));
            }
        }

        System.out.println(list);
    }
}
