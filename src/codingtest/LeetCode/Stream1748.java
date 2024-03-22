package codingtest.LeetCode;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream1748 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};

        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        int sum = map.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .mapToInt(e -> e.getKey())
                .sum();

        System.out.println(sum);


        Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .mapToInt(e -> e.getKey())
                .sum();
    }
}
