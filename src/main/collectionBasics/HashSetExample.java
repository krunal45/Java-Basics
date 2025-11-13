package main.collectionBasics;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Character> alphabets = new HashSet<>();
        System.out.println("Default Capacity: "+alphabets.size());
        alphabets.add('X');
        alphabets.add('B');
        alphabets.add('Y');
        alphabets.add('D');
        alphabets.add(null);
        System.out.println(alphabets);
    }
}
