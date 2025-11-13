package main.collectionBasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronisedHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>(Map.of(1, "Tom", 2, "David", 3, "Peter"));
        Map<Integer, String> map2 = Collections.synchronizedMap(map1);
        map2.forEach((k, v) -> System.out.println(" " + k + " : " + v));

//        can add null key and values here
        map2.put(4, "RRobert");
        map2.put(null, "Jira");
        map2.put(5, null);
        map2.forEach((k, v) -> System.out.println(" " + k + " : " + v));
    }
}
