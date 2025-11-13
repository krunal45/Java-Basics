package main.Stack;

import java.util.Stack;

public class Example1 {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
//        Is Stack Empty
        boolean flag = numbers.empty();
        System.out.println("Is Stack Empty ? "+flag);
        try {
            numbers.pop();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            numbers.push(1);
            numbers.push(2);
            numbers.push(3);
            System.out.println(numbers);
            int firstElement = numbers.peek();
            System.out.println("firstElement :"+firstElement);
            firstElement = numbers.pop();
            System.out.println("firstElement :"+firstElement);
            System.out.println(numbers);
//            searching for '3'
            int index = numbers.search(2);
            String message = (index != -1)?Integer.toString(index):"Number not found!";
            System.out.println(message);
        }
    }
}
