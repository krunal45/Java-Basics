package main.collectionBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListComparison {
    public static void main(String[] args) {
        ArrayList<Character> l1 = new ArrayList<>(Arrays.asList('f', 'a', 'i', 'o', 'u'));
        ArrayList<Character> l2 = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o'));

//        sorting list
//        Before removing
        Collections.sort(l1);
        System.out.println(l1);
        Collections.sort(l2);
        System.out.println(l2);
//
////        compare list
//        System.out.println("Lists Equal :" + l1.equals(l2));

//        Finding missing elements
//        l1.removeAll(l2);
//        System.out.println(l1);
//        Finding common elements
//        After removing
        l1.retainAll(l2);
        System.out.println(l2);
    }
}
