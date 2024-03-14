package ch11.set;

import java.util.HashSet;
import java.util.Objects;

public class C03HashSet {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc"); //중복
        set.add(new Person("David", 10));
        set.add(new Person("David", 10)); //중복

        System.out.println(set);
    }
}

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age=age;
    }

    public String toString(){
        return name + " : " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        Person p = (Person) o;

        //나 자신의 이름과 나이를 p와 비교
        return this.name.equals(p.name)&&this.age==p.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
