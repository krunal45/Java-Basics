package main;

import java.util.*;

public class TreeMapExample {

    public static void main(String[] args) {
        Comparator<String> lastNameDescendingOrder = (o1, o2) -> {
            String lastName1 = o1.substring(o1.lastIndexOf(" ") + 1);
            String lastName2 = o2.substring(o2.lastIndexOf(" ") + 1);
            return lastName2.compareTo(lastName1);
        };

//        Comparator<String> lastNameAscendingOrder = (o1, o2) -> {
//            String lastName1 = o1.substring(o1.lastIndexOf(" ") + 1);
//            String lastName2 = o2.substring(o2.lastIndexOf(" ") + 1);
//            return lastName2.compareTo(lastName1);
//        };

        Map<String, Integer> names = new TreeMap<>(lastNameDescendingOrder);
        names.put("Alok Bhatt", 1000);
        names.put("Bob Cheung", 2000);
        names.put("Charu Upadhyay", 2500);
        names.put("David Agarval", 3000);
        System.out.println(names);
    }
}