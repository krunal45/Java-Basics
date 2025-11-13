package main.MapConcept;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapMethods {
    public static void main(String[] args) {
        SortedMap<Character,String> alphabets = new TreeMap<>();
        alphabets.put('A',"Apple");
        alphabets.put('B',"Banana");
        alphabets.put('C',"Chickoo");
        alphabets.put('D',"Dragon Fruit");
        for (Map.Entry<Character,String> alphabet:alphabets.entrySet())
            System.out.println(alphabet.getKey()+" : "+alphabet.getValue());

//        Get First Key
        Character firstKey = alphabets.firstKey();
        System.out.println("firstKey :"+firstKey);
//        Get Last Key
        Character lastKey = alphabets.lastKey();
        System.out.println("lastKey :"+lastKey);
//        Get First 2 Elements
        SortedMap<Character,String> firstTwoElements = alphabets.headMap('C');
        System.out.println("firstTwoElements: "+firstTwoElements);
//        Get middle 2 Elements
        SortedMap<Character,String> middleTwoElements = alphabets.subMap('B','D');
        System.out.println("middleTwoElements :"+middleTwoElements);
//        Get Last 2 Elements
        SortedMap<Character,String> lastTwoElements = alphabets.tailMap('C');
        System.out.println("lastTwoElements :"+lastTwoElements);
    }
}