package interviewQuestions;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.offer(7);
        nums.offerFirst(1);
        nums.offerLast(8);

        for (Integer num : nums) {
            System.out.println(num);
        }

        System.out.println("First Index Element : " + nums.get(0));
        System.out.println("First Element is :" + nums.getFirst());
        System.out.println("Last Element is :" + nums.getLast());
    }
}
