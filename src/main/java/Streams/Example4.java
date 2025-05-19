package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example4 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(2, 1, 3, 4, 5));
        Stream<Integer> stream = nums.stream();
        //        Stream can only be consumed once. Stream will get closed after used.
//        sorting the list using stream
        Stream<Integer> sortedStream = stream.sorted();
//        Filtering out odd numbers
        System.out.println("--oddNumbers--");
        sortedStream.filter(number -> number % 2 != 0)
                .map(number -> number * 2)
                .forEach(n -> System.out.print(n + "\t"));
    }
}
