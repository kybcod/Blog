package codingtest.LeetCode;

import java.util.TreeSet;

public class Set414TreeSet {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};

        TreeSet<Integer> set = new TreeSet<>();
        for(int num : nums) set.add(num);

        if(set.size() >=  3){
            set.pollLast();
            System.out.println(set.pollLast());
            set.pollLast();
            System.out.println(set.pollLast());
        }
        set.pollLast();

    }
}

//        int third = 0;
//        if(set.size()<3){
//            third = set.last();
//        }
//        else {
//            Iterator<Integer> iterator = set.descendingIterator();
//            while (iterator.hasNext()){
//                iterator.next();
//                iterator.next();
//                third = iterator.next();
//            }
//        }

