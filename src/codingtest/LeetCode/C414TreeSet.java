package codingtest.LeetCode;

import java.util.Set;
import java.util.TreeSet;

public class C414TreeSet {
    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        int count = 0;
        int third = 0;

        //3번째 큰 수 구하기
        Set<Integer> set = new TreeSet<>();
        for(int num:nums){
            set.add(num);
            count++;
            if(count == 3){
                third = num;
            }
        }

        System.out.println(third);
    }
}
