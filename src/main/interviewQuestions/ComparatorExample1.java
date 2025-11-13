package main.interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample1 {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (o1, o2) -> {
            if (o1 / 10 > o2 / 10)
                return 1;
            else
                return -1;
        };

        List<Integer> marks = new ArrayList<>();
        marks.add(87);
        marks.add(91);
        marks.add(21);
        marks.add(30);
        System.out.println("--before sort--");
        for (Integer mark : marks)
            System.out.println(mark);
        marks.sort(comparator);
        System.out.println("--after sort--");
        for (Integer mark : marks)
            System.out.println(mark);
    }
}
