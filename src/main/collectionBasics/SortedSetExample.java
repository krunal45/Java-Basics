package main.collectionBasics;

import java.util.*;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<Character> alphabets = new TreeSet<>();
        alphabets.add('A');
        alphabets.add('B');
        alphabets.add('C');
        alphabets.add('D');
        Iterator<Character> sortedIterator = alphabets.iterator();
        while (sortedIterator.hasNext()){
            System.out.print(sortedIterator.next()+"\t");
        }
        System.out.println();
        System.out.println("First element in alphabets: "+alphabets.first());
        System.out.println("Last element in alphabets: "+alphabets.last());
        SortedSet<Character> firstTwoAlphabets = alphabets.headSet('C');
        System.out.println(firstTwoAlphabets);
        Spliterator<Character> spliterator = alphabets.spliterator();

        spliterator.tryAdvance(System.out::println);//first Element
        spliterator.tryAdvance(System.out::println);//second Element
        spliterator.forEachRemaining(System.out::println);//Printing remaining Elements
    }
}
