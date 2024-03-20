package codingtest.LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set442 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        List<Integer> list = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(!set.add(i)) list.add(i);
        }
        System.out.println(list);

    }
}
