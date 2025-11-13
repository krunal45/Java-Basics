package main.interviewQuestions;

import java.util.Arrays;
import java.util.List;

public class StreamsMapExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 3, 5, 7, 8, 10);

//        Function<Integer, Integer> obj = n -> n * 2;
        nums.stream().map(n -> n * 2).forEach(System.out::println);
    }
}
