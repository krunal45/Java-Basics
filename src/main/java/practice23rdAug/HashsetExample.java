package practice23rdAug;

import java.util.*;

public class HashsetExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 8, 10));
        System.out.println("--Initial List--");
        numbers.forEach(System.out::println);
        System.out.println("--Removing Duplicates--");
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        numbers.clear();
        numbers.addAll(uniqueNumbers);
        numbers.forEach(System.out::println);
    }
}
