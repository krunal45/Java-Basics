package main.MapConcept;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Character,String> alphabets = new LinkedHashMap<>();
        alphabets.put('A', "Apple");
        alphabets.put('B', "Banana");
        alphabets.put('C', "Chickoo");
        alphabets.put('D', "Dragon Fruit");
//        Iteration
        Iterator<Map.Entry<Character, String>> alphabetsEntrySet = alphabets.entrySet().iterator();
        while (alphabetsEntrySet.hasNext())
            System.out.println(alphabetsEntrySet.next());

//        Replace map value
        alphabets.replace('A', "Apple","Ahmedabad");
        System.out.println("New value for key A: "+alphabets.get('A'));
//       Verifying if Map contains certain value
        System.out.println(("Map contains Ahmedabad? "+alphabets.containsValue("Ahmedabad")));
        System.out.println(("Map contains Baroda? "+alphabets.containsValue("Baroda")));
//      Compute if Present
        String value = alphabets.computeIfPresent('B',(k,v)-> v.replace('B', 'C'));
        System.out.println("New value > "+value);
        System.out.println("New Map Value: "+alphabets.get('B'));
    }
}
