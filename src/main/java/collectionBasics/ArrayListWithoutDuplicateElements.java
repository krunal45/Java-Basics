package collectionBasics;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListWithoutDuplicateElements {
    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 1, 2, 3, 4));
//        System.out.println("---Duplicate Numbers---");
//        numbers.forEach(System.out::println);
//        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);
//        System.out.println("---Unique Numbers---");
//        uniqueNumbers.forEach(System.out::println);

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Apple", "Banana", "Chickoo", "Apple", "Banana"));
        System.out.println("---Duplicate Names---");
        names.forEach(System.out::println);
        System.out.println("---unique Names---");
        List<String> uniqueNames = names.stream().distinct().toList();
        uniqueNames.forEach(System.out::println);
    }
}
