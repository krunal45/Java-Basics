package practice23rdAug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 7, 8, 9, 10, 12, 11, 14, 16));
        System.out.println("--List of Nums initially--");
        nums.forEach(System.out::println);
        int sumOfEvenNums = nums.parallelStream().filter(num -> num % 2 == 0)
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of Even Nums :" + sumOfEvenNums);
    }
}
