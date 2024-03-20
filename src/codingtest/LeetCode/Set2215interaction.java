package codingtest.LeetCode;

import java.util.*;

public class Set2215interaction {
    public static void main(String[] args) {

        int nums1[] = {1,2,3,3};
        int nums2[] = {1,1,2,2};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i : nums1){
            set1.add(i);
        }
        System.out.println(set1); //[1, 2, 3]

        for(int i : nums2){
            set2.add(i);
        }
        System.out.println(set2); //[1, 2]

        set1.retainAll(set2);  //f

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist1 = new ArrayList<>();
        List<Integer> sublist2 = new ArrayList<>();

        for(int i: nums1){
            if(!set1.contains(i)) {
                if (!sublist1.contains(i)) {
                    sublist1.add(i);
                }
            }
        }
        System.out.println(sublist1); //[3, 3]

        for(int i: nums2){
            if(!set1.contains(i)){
                sublist2.add(i);
            }
        }

        list.add(sublist1);
        list.add(sublist2);

        System.out.println(list);
    }
}
