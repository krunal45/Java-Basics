//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
// and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class InterviewQuestion1 {

    static LinkedList<Integer> addNumbers(LinkedList<Integer> num1, LinkedList<Integer> num2) {
        StringBuilder n1 = new StringBuilder();
        StringBuilder n2 = new StringBuilder();
        int x1;
        int x2;
        int sum;
        for (int num : num1)
            n1.append(num);

        for (int num : num2)
            n2.append(num);

        n1.reverse();
        n2.reverse();
        x1 = Integer.parseInt(n1.toString());
        x2 = Integer.parseInt(n2.toString());
        sum = x1 + x2;
        LinkedList<Integer> result = new LinkedList<>();
        String s = String.valueOf(sum);
        String string[] = s.split("");
        for (int i = 0; i < string.length; i++) {
            result.add((Integer.parseInt(string[i])));
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> num1 = new LinkedList<>(List.of(1, 2, 2));
        LinkedList<Integer> num2 = new LinkedList<>(List.of(44));
        System.out.println(addNumbers(num1, num2));
    }
}