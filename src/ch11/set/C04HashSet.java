package ch11.set;

import java.util.HashSet;
import java.util.Iterator;

public class C04HashSet {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");setA.add("2");setA.add("3");setA.add("4");setA.add("5");
        System.out.println("A="+setA);

        setB.add("4");setB.add("5");setB.add("6");setB.add("7");setB.add("8");
        System.out.println("B="+setB);

        Iterator it = setB.iterator();
        while (it.hasNext()){
            Object tmp = it.next();
            if(setA.contains(tmp)) setKyo.add(tmp);
        }
//        setA.retainAll(setB); //교집합
        System.out.println("교집합 = "+setKyo);


        it = setA.iterator();
        while (it.hasNext()){
            Object tmp = it.next();
            if(!setB.contains(tmp)){
                setCha.add(tmp);
            }
        }
//        setA.removeAll(setB); //차집합
        System.out.println("차집합 = " +setCha);

        it = setA.iterator();
        while (it.hasNext()){
            setHab.add(it.next());
        }

        it = setB.iterator();
        while (it.hasNext()){
            setHab.add(it.next());
        }
//        setA.addAll(setB); //합집합
        System.out.println("합집합 = " +setHab);
    }
}


