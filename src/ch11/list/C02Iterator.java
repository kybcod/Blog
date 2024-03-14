package ch11.list;

import java.util.ArrayList;
import java.util.Iterator;

public class C02Iterator {
    public static void main(String[] args) {
//        Collection list = new ArrayList();
//        Collection list = new HashSet();
//        HashSet list = new HashSet();
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();

        int sum = 0;
        while (it.hasNext()){
            Object obj = Integer.parseInt(it.next().toString());
            sum +=(int) obj;
        }
        System.out.println(sum);

    }
}
