package main.MapConcept;

import java.util.*;

public class Example1_061123 {

    static Map<String, Integer> wordFrequencyCounter(List<String> words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase().replaceAll("[\\!\\\"\\'\\,\\.\\;\\:\\?\\(\\)\\[\\]\\{\\}]", "");
            if (map.containsKey(word))
                map.put(word, map.get(word) + 1);
            else
                map.put(word, 1);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(wordFrequencyCounter(new ArrayList<>(Arrays.asList("Tom","Dick","Herry","Tom","Dick","Ajay","Ajay.","ajay"))));
    }
}
