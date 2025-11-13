package main.TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Example1 {
    public static void main(String[] args) {
        Comparator<String> reverseOrder = (o1, o2) -> o2.compareTo(o1);
        Set<String> daysOfWeek = new TreeSet<>(reverseOrder);
        daysOfWeek.add("Sun");
        daysOfWeek.add("Mon");
        daysOfWeek.add("Tue");
        daysOfWeek.add("Wed");
        daysOfWeek.add("Thu");
        daysOfWeek.add("Fri");
        daysOfWeek.add("Sat");
        System.out.println(daysOfWeek);
    }
}