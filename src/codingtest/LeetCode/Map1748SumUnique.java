package codingtest.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1748SumUnique {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};

        //count가 1이 것만 더하기
        Map<Integer, Integer> map = new HashMap<>();

        for(int num:nums){
            Integer value = map.get(num);
            if (value == null) {
                map.put(num, 1);
            } else {
                map.put(num, value + 1);
            }
        }

        int result = 0;
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer, Integer> entry : entrySet){
            if(entry.getValue() == 1){
                result += entry.getKey();
            }

        }

        System.out.println(result);
    }
}
