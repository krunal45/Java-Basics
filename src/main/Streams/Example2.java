package main.Streams;
/*
Problem Statement: You have a list of String names, and you want to group the names by the
first letter of each name and count how many names start with each letter using Java Streams.
Write a Java method that takes a List of names and returns a Map where the keys are the first letters of the names,
 and the values are the counts of names starting with that letter.
 Akash,
 Babita

 A -> 1
 B -> 1
 */

import java.util.*;

public class Example2 {

    Map<Character, Integer> getNameCount(List<String> names) {
        Map<Character, Integer> map = new HashMap<>();
        for (char i = 'A'; i <= 'Z'; i++) {
            char finalI = i;
            List<String> filteredNames = names.stream().filter(name -> name.charAt(0) == finalI).toList();
            map.put(i, filteredNames.size());
        }
        return map;
    }

    public static void main(String[] args) {
        Example2 obj = new Example2();
        Map<Character, Integer> map = obj.getNameCount(new ArrayList<>(List.of("Akash", "Babita","Cherry","David","Ella","Fergusan")));
        System.out.println(map);
    }
}