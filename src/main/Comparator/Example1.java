// sort integers in ascending order using comparator
package main.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(2, 1, 3, 4));
        System.out.println("--Before Sorting--");
        numbers.forEach(System.out::println);

        System.out.println("--After Sorting in descending order--");
        Comparator<Integer> descendingComparator = (o1, o2) -> (o1 > o2) ? -1 : 1;
        numbers.sort(descendingComparator);
        numbers.forEach(System.out::println);

        System.out.println("--After Sorting in ascending order--");
        Comparator<Integer> ascendingComparator = (o1, o2) -> (o1 > o2) ? 1 : -1;
        numbers.sort(ascendingComparator);
        numbers.forEach(System.out::println);
    }
}
