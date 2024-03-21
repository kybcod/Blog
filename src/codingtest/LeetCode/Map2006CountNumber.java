package codingtest.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Map2006CountNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int k = 1;

        Map<Integer, Integer> countMap = new HashMap<>();
        int pairCount = 0;

        // 각 숫자의 등장 횟수를 맵에 기록
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (k == 0) {
                // k가 0인 경우, 각 숫자의 등장 횟수가 2 이상일 때 쌍을 구함
                if (countMap.get(num) >= 2) {
                    pairCount++;
                    // 같은 숫자는 한 번만 사용될 수 있도록 등장 횟수를 줄임
                    countMap.put(num, countMap.get(num) - 1);
                }
            } else {
                // nums[i] + k가 맵에 존재하는지 확인
                if (countMap.containsKey(num + k)) {
                    pairCount++;
                }
            }
        }


        System.out.println(pairCount);



    }
}


//for(int i = 0; i< nums.length-1;i++){
//        for(int j = i+1; j< nums.length;j++){
//        if(Math.abs(nums[i]-nums[j]) == k){
//pairCount++;
//        }
//        }
//        }