/*
Write a Java function that takes two `ArrayList`s of integers as input, `list1` and `list2`.
The function should return a new `ArrayList` containing only the elements that are present in both `list1` and `list2`,
maintaining the order of appearance from `list1`.  Duplicate elements should only appear once in the resulting list.

For example:

*   If `list1` is `[1, 2, 3, 2, 4, 5]` and `list2` is `[3, 2, 6, 1, 7, 2]`, the function should return `[1, 2, 3, 4]`.
*   If `list1` is `[1, 2, 3]` and `list2` is `[4, 5, 6]`, the function should return an empty list `[]`.

Provide a complete, runnable Java code solution.

 */
package ArrayListConcept;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 5, 6, 7));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(8, 6, 5, 3, 7, 6));
        ArrayList<Integer> list3 = new ArrayList<>();

        System.out.println("List 1 > " + list1);
        System.out.println("List 2 > " + list2);
        for (Integer element : list1) {
            if (list2.contains(element)) {
                list3.add(element);
            }
        }
        System.out.println("List 3 > "+list3);
    }
}

// Code from Gemini:
//import java.util.ArrayList;
//import java.util.LinkedHashSet;
//import java.util.List;
//import java.util.Set;
//
//public class CommonElements {
//
//    public static ArrayList<Integer> findCommonElements(ArrayList<Integer> list1, ArrayList<Integer> list2) {
//        // Use a LinkedHashSet to maintain order and remove duplicates
//        Set<Integer> commonElementsSet = new LinkedHashSet<>();
//
//        for (Integer element : list1) {
//            if (list2.contains(element)) {
//                commonElementsSet.add(element);
//            }
//        }
//
//        // Convert the Set back to an ArrayList
//        return new ArrayList<>(commonElementsSet);
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 2, 4, 5));
//        ArrayList<Integer> list2 = new ArrayList<>(List.of(3, 2, 6, 1, 7, 2));
//        ArrayList<Integer> commonList = findCommonElements(list1, list2);
//        System.out.println("List 1: " + list1);
//        System.out.println("List 2: " + list2);
//        System.out.println("Common Elements: " + commonList); // Output: [1, 2, 3, 4]
//
//        ArrayList<Integer> list3 = new ArrayList<>(List.of(1, 2, 3));
//        ArrayList<Integer> list4 = new ArrayList<>(List.of(4, 5, 6));
//        commonList = findCommonElements(list3, list4);
//        System.out.println("List 3: " + list3);
//        System.out.println("List 4: " + list4);
//        System.out.println("Common Elements: " + commonList); // Output: []
//
//        ArrayList<Integer> list5 = new ArrayList<>(List.of(1, 1, 2, 2, 3));
//        ArrayList<Integer> list6 = new ArrayList<>(List.of(1, 2, 3, 3));
//        commonList = findCommonElements(list5, list6);
//        System.out.println("List 5: " + list5);
//        System.out.println("List 6: " + list6);
//        System.out.println("Common Elements: " + commonList); // Output: [1, 2, 3]
//
//    }
//}