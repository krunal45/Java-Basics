package collectionBasics;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
//        numbers
        System.out.println("--Numbers--");
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        Iterator<Integer> integerIterator = numbers.iterator();
        while (integerIterator.hasNext()){
            System.out.print(integerIterator.next()+"\t");
        }
        System.out.println();
//        Characters
        System.out.println("--Characters--");
        TreeSet<Character> alphabets = new TreeSet<>();
        alphabets.add('c');
        alphabets.add('b');
        alphabets.add('a');
        alphabets.add('d');
        System.out.println(alphabets);
    }
}
