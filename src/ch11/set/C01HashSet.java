package ch11.set;

import java.util.HashSet;
import java.util.Set;

public class C01HashSet {
    public static void main(String[] args) {
        Object[] objArr ={"1", "2","2","3","3","3","4","4"};
        Set set = new HashSet();

        for(int i = 0; i< objArr.length; i++){
            set.add(objArr[i]);
        }
        System.out.println(set);
    }
}
