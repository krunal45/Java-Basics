package interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsFilterExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 3, 4, 6, 7, 8);
//        Stream<Integer> stream = nums.stream();
//        stream.forEach(System.out::println);

//        Applying Filter to get only odd numbers
//        Predicate<Integer> predicate = n -> (n % 2 != 0);
        nums.stream().filter(n -> (n % 2 != 0)).forEach(System.out::println);
        
    }
}
