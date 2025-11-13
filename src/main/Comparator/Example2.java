// sort the strings in ascending order based on their length
package main.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Technology", "Sky", "Unpredictability", "Riverbank", "Internationalization"));
        System.out.println("--Before Sorting--");
        strings.forEach(System.out::println);
        System.out.println("--After sorting strings in ascending order based on length!");
        Comparator<String> stringComparator = (o1, o2) -> (o1.length() > o2.length()) ? 1 : -1;
        strings.sort(stringComparator);
        strings.forEach(string -> System.out.println(string + " : " + string.length()));
    }
}
