package MapConcept;

import java.util.*;

public class MapOrderElementsExample {
    public static void main(String[] args) {
        Comparator<Integer> reverseOrder1 = (o1, o2) -> {
            if (o1 < o2)
                return 1;
            else if (o1 > o2)
                return -1;
            else
                return 0;
        };
        Map<Integer,String> alphabets = new TreeMap<>(reverseOrder1);
        alphabets.put(5, "Cat");
        alphabets.put(3, "Dog");
        alphabets.put(1, "Boy");
        alphabets.put(2, "Apple");

        Iterator<Map.Entry<Integer,String>> iterator = alphabets.entrySet().iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}