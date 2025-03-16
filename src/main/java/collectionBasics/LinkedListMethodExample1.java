package collectionBasics;

import java.util.LinkedList;

public class LinkedListMethodExample1 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.addFirst(0);
        numbers.addLast(5);
        System.out.println("numbers 1 > "+numbers);
        numbers.remove();
        System.out.println("Removing First Element");
        System.out.println("numbers 2 > "+numbers);
        numbers.remove(Integer.valueOf(1));
        System.out.println("Removing integer 1 > ");
        System.out.println("numbers 3 > "+numbers);
        int firstElement = numbers.removeFirst();
        System.out.println("Removing element "+firstElement+" ");
        System.out.println("numbers 4 > "+numbers);
        int lastElement = numbers.removeLast();
        System.out.println("Removing element "+lastElement+" ");
        System.out.println("numbers 5 > "+numbers);
    }
}
