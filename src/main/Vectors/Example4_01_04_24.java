package main.Vectors;

import java.util.List;
import java.util.Vector;
import java.util.stream.Stream;

public class Example4_01_04_24 {

    public static Vector<Integer> manipulateVector(Vector<Integer> v) {
        Stream<Integer> x = v.stream().distinct().sorted();
        List<Integer> list = new java.util.ArrayList<>(x.toList());
        if (list.size() % 2 != 0) {
            list.remove(list.size() / 2);
        }
        v = new Vector<>(List.of());
        v.addAll(list);
        return v;
    }

    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>(List.of(5, 2, 9, 2, 7, 5, 9, 4));
        System.out.println(manipulateVector(nums));
    }
}
