package ch11.map;

import java.util.Arrays;

public class LinearProbingHashMap {
    private static final int INITIAL_CAPACITY = 6;
    private static final double LOAD_FACTOR_THRESHOLD = 0.75;

    private int size;
    private int capacity;
    private String[] keys;
    private String[] values;

    public LinearProbingHashMap() {
        this.size = 0;
        this.capacity = INITIAL_CAPACITY;
        this.keys = new String[capacity];
        this.values = new String[capacity];
    }

    //해시함수
    private int hash(String key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    //데이터 삽입
    public void put(String key, String value) {
        if (size >= LOAD_FACTOR_THRESHOLD * capacity) {
            resize();
        }

        int index = hash(key);
        while (keys[index] != null) {
            //같은 키가 존재하면 값 업데이트
            if (keys[index].equals(key)) {
                values[index] = value;
                return;
            }
            index = (index + 1) % capacity; // 선형 탐사법
        }

        keys[index] = key;
        values[index] = value;
        size++;
    }

    //키에 해당하는 값 받기
    public String get(String key) {
        int index = hash(key);
        while (keys[index] != null) {
            if (keys[index].equals(key)) {
                return values[index];
            }
            index = (index + 1) % capacity; // 선형 탐사법
        }
        return null;
    }

    //Resizing
    private void resize() {
        capacity *= 2;
        String[] newKeys = Arrays.copyOf(keys, capacity);
        String[] newValues = Arrays.copyOf(values, capacity);
        keys = newKeys;
        values = newValues;
    }

    public static void main(String[] args) {
        LinearProbingHashMap map = new LinearProbingHashMap();
        map.put("010-1234-1234", "홍길동");
        map.put("010-1111-2222", "김흥부");
        map.put("010-3333-4444", "김놀부");
        map.put("010-4444-5555", "이심청");

        System.out.println("'010-1234-1234': " + map.get("010-1234-1234"));
        System.out.println("'010-1111-2222': " + map.get("010-1111-2222"));
        System.out.println("'010-3333-4444': " + map.get("010-3333-4444"));
        System.out.println("'010-4444-5555': " + map.get("010-4444-5555"));
    }
}

