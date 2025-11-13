package main.interviewQuestions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        nums.add(212);
        nums.add(41);
        nums.add(63);
        nums.add(89);
        nums.add(24);
        for (Integer num : nums) {
            System.out.println(num);
        }

        Set<Integer> nums1 = new TreeSet<>(nums);
        System.out.println("--sorted Set--");
        for (Integer num : nums1)
            System.out.println(num);

        System.out.println("--Using Iterator--");
        Iterator<Integer> iterable = nums1.iterator();
        while (iterable.hasNext()) {
            System.out.println(iterable.next());
        }
    }
}
