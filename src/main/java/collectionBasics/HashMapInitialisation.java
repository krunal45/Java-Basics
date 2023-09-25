package collectionBasics;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialisation {
    public static void main(String[] args) {
        Map<String, String> students = Stream.of(new String[][]{
                {"Name", "Designation"},
                {"Krunal", "QA"}
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));
        students.forEach((k, v) -> System.out.println(" " + k + " :" + v));

        Map<Integer, String> map2 = Map.of(1, "Krunal", 2, "Anjali", 3, "Gaurav");
        map2.forEach((k, v) -> System.out.println(" " + k + " :" + v));
        
    }
}
