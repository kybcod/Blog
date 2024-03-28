package ch11.map;

import java.util.LinkedList;

public class HashTable {
    private static final int SIZE = 5; // 해시 테이블의 크기
    private LinkedList<Integer>[] table; // 연결 리스트 배열

    // 생성자
    public HashTable() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // 해시 함수: 키를 해시값으로 변환하여 해시 테이블의 인덱스를 반환
    private int hashFunction(int key) {
        return key % SIZE;
    }

    // 데이터 삽입
    public void insert(int key) {
        int index = hashFunction(key);
        table[index].add(key);
    }

    // 데이터 삭제
    public void delete(int key) {
        int index = hashFunction(key);
        table[index].remove((Integer) key); // Integer 객체로 형변환하여 요소 삭제
    }

    // 해시 테이블 출력
    public void printTable() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Bucket " + i + ": ");
            for (Integer value : table[i]) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.insert(10);
        ht.insert(14);
        ht.insert(23);
        ht.insert(15); // 충돌 발생
        ht.printTable();

        System.out.println();

        ht.delete(15);
        ht.printTable();
    }
}

