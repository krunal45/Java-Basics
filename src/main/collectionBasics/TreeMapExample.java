package main.collectionBasics;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> empSalary = new TreeMap<>();
        empSalary.put("Adam", 1000);
        empSalary.put("Charles", 2000);
        empSalary.put("Bob", 3000);
        System.out.println(empSalary);

//        Print empSalary greater than 2000
        System.out.println(empSalary.firstKey());
        System.out.println(empSalary.lastKey());
        Set<Integer> greaterThan2000;
    }
}
