package collectionBasics;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map1 = new ConcurrentHashMap<>(Map.of(1, "Apple", 2, "Banana", 3, "Chickoo"));
        map1.forEach((k, v) -> System.out.println(" " + k + " :" + v));
        ConcurrentHashMap<Integer, String> map2 = map1;
//        null key/value not allowed
        map2.put(null, "App");
        map2.put(4, null);
    }
}