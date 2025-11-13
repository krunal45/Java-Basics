package main.collectionBasics;

import java.util.Arrays;
import java.util.Vector;

public class MyVectorExample {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>(Arrays.asList(2, 4, 6, 8, 10));
        numbers.forEach(System.out::println);
        System.out.println("Number at 1st Index :" + numbers.get(1));

        Vector<Integer> moreNumbers = new Vector<>(Arrays.asList(12, 14));
        numbers.addAll(moreNumbers);
        numbers.forEach(System.out::println);
    }
}
