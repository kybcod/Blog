package ch11.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class C01ArrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(5);
        list1.add(3);
        list1.add(2);
        list1.add(3);
        list1.add(7);
        list1.add(9);
        System.out.println("list1 = " + list1); //list1 = [5, 3, 2, 3, 7, 9]

        //from인덱스~to인덱스-1 사이 객체 반환
        ArrayList list2 = new ArrayList(list1.subList(1,4));
        System.out.println("list2 = " + list2); //list2 = [3, 2, 3]

        Collections.sort(list1);
        System.out.println("list1 = " + list1); //list1 = [2, 3, 3, 5, 7, 9]

        // containsAll(true/false)
        System.out.println(list1.containsAll(list2)); //true

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        System.out.println("list2 = " + list2); //list1 = [5, 3, 2, 3, 7, 9]

        // retainAll(true/false) - 겹치는 부분만 남기고 나머지 삭제
        System.out.println(list1.retainAll(list2));
        print(list1, list2);

        //list2에서 list1과 공통되는 요소 삭제하기
        for(int i = list2.size()-1; i>=0; i--){
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);


    }

    private static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println();
    }
}
