package codingtest.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class C118PascalTriangle2_2 {
    public static void main(String[] args) {
        int numRows = 5;

        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1)); //첫번째 행에 1 하나 추가

        for(int i = 2; i <= numRows; i++){ //두번째 행부터~마지막 행
            List<Integer> prev = list.getLast(); //이전행 가져오기
            List<Integer> next = new ArrayList<>(); //새로운 행 생성
            next.add(1); //첫번째 요소는 무조건 1

            //그 다음 요소는 값을 더해줘야 한다.
            for(int n = 1; n < prev.size() ; n++){
                System.out.println("prev = " + prev);
                next.add(prev.get(n) + prev.get(n-1)); //이전 행의 같은 인덱스와 그 전 인덱스의 값을 더한 값
            }

            next.add(1); //마지막 요소는 무조건 1
            list.add(next); //새로운 행 추가
        }
        System.out.println(list);
    }
}
