package practice23rdAug;

import java.util.*;

public class ListExample1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 4, 5, 7, 9, 11, 13));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 5, 7, 6, 2, 7));
        Set<Integer> commonElementsSet = new HashSet<>();

        System.out.println("--List 1--" + list1);
        System.out.println("--List 2--" + list2);
        for (int n : list1) {
            if (list2.contains(n)) {
                commonElementsSet.add(n);
            }
        }
        System.out.println("--Common Elements between list 1 and list 2--");
        commonElementsSet.forEach(System.out::println);
    }
}
