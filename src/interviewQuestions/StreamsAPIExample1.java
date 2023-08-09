package interviewQuestions;

import java.util.Arrays;
import java.util.List;

public class StreamsAPIExample1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 4, 5, 6, 7, 8);
        nums.forEach(System.out::println);
    }
}
