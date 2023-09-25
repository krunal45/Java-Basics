package interviewQuestions;

import java.util.Arrays;
import java.util.List;

public class StreamsReduceExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 3, 5, 6, 7, 8, 10);
        int res = nums.stream()
                .filter(n -> n % 2 == 0).reduce(1, (a, b) -> a * b);
        System.out.println(res);
    }
}
