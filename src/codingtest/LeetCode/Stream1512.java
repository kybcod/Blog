package codingtest.LeetCode;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream1512 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};

        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(map);

        int sum = map.entrySet()
                .stream()
                .filter(e->(e.getValue() * (e.getValue() - 1)) / 2 > 0)
                .mapToInt(e-> e.getKey())
                .sum();

        System.out.println(sum);

    }
}
