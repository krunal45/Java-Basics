package MapConcept;

import java.util.*;

public class Example2_061123 {

    static Map<Integer, Integer> getMap(List<Integer> list1, List<Integer> list2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : list2) {
            if (list1.contains(num)) {
                map.put(num, list1.indexOf(num));
            }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(getMap(new ArrayList<>(Arrays.asList(1,2,1)), new ArrayList<>(Arrays.asList(2,1,1))));
    }
}