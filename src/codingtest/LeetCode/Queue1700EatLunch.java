package codingtest.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1700EatLunch {
    public static void main(String[] args) {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};

        Queue<Integer> qsandwich = new LinkedList<>();
        Queue<Integer> qstudent = new LinkedList<>();

        for(int st : students){
            qstudent.offer(st); //{1,1,0,0};
        }

        for(int sw : sandwiches){
            qsandwich.offer(sw); //{0,1,0,1};
        }

        while(!qstudent.isEmpty()){
            if( qsandwich.peek() == qstudent.peek()){
                qstudent.poll();
                qsandwich.poll();
            }
            else{
                if(!qstudent.contains(qsandwich.peek())) break; //학생들이 선호하는 샌드위치 없으면 종료
                qstudent.offer(qstudent.poll());//학생 큐에 제거 후 뒤로 보내기
            }
        }


        System.out.println(qstudent.size());

    }
}
