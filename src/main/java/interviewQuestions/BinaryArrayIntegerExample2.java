package interviewQuestions;

import java.util.Arrays;

public class BinaryArrayIntegerExample2 {


    public static void main(String[] args) {
        int[] ages = {3, 4, 5, 7, 9, 0};
        Arrays.sort(ages);
        for (int age : ages) {
            System.out.println(age);
        }

        int res = binarySearch(ages, 41);
        if (res != -1)
            System.out.println("Element found at index :" + res);
        else
            System.out.println("Element not found.");
    }


    public static int binarySearch(int[] ages, int target) {
        int start = 0;
        int end = ages.length - 1;

        while (start <= end) {
            int median = (start + end) >>> 1;
            if (ages[median] == target)
                return median;
            else if (target < ages[median]) {
                end = median - 1;
            } else {
                start = median + 1;
            }

        }
        return -1;
    }
}
