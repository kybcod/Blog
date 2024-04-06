package codingtest.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List118Pascal2_1 {
    public static void main(String[] args) {
        int rowIndex = 3;

        List<Integer> list = new ArrayList<>();
        for(int row = 0; row <= rowIndex; row++){
            list.add(0,1);
            for(int i = 1; i<row; i++){

                list.set(i, list.get(i)+list.get(i+1));
            }
        }

        System.out.println(list);


        int numRows = 5;
        List<List<Integer>> list2 = new LinkedList<>();

        for (int row = 0; row < numRows; row++) {

            List<Integer> sublist1 = new ArrayList<>();

            for(int i = 0; i<=row; i++){
                if(i == 0 || i == row) {
                    sublist1.add(1);
                }
                else {
                    sublist1.add(i, list2.get(row-1).get(i-1)+list2.get(row-1).get(i));
                }
            }
            list2.add(sublist1);
        }

        System.out.println(list2);
    }

}


/*
1. row = 0 : sublist - 1추가, list - [1]추가
2. row = 1 : sublist - {i=0, 1추가 / i=1, 1추가} , list-[1,1]추가
3. row = 2 : sublist - {i = 0, 1추가/ i=1일 때, else문으로(2 추가/ i=2일 때 1추가}
4. row = 3 : sublsit - {i = 0, 1추가 / i =1일 떄, else문으로(3추가) / i = 2일 때 else문으로(3추가) / i = 3일 때 1추가}
5. row = 4 : sublist -  {i = 0, 1추가 / i =1일 떄, else문으로(4추가) / i = 2일 때 else문으로(6추가) / i =3일 떄, else문으로(4추가) / i = 4일 때 1추가}
*/