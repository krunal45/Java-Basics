package main.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class A implements Comparator {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    public static void main(String[] args) {
        A a1 = new A();
        a1.setName("Ajay");
        a1.setAge(23);

        A a2 = new A();
        a2.setName("Adam");
        a2.setAge(22);

        List<A> list = new ArrayList<>(List.of(a1, a2));
        list.forEach(a -> System.out.println(a.getName() + " : " + a.getAge()));

        List<A> sortedList = list.stream().sorted().toList();
        sortedList.forEach(a -> System.out.println(a.getName() + " : " + a.getAge()));
    }
}
