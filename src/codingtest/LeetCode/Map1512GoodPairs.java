package codingtest.LeetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map1512GoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int value = (int) map.get(nums[i]);
                map.put(nums[i], value + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        int pairs = 0;

        for(int count : map.values()){
            pairs += count * (count-1)/2;
        }

        System.out.println(pairs);
    }
}
