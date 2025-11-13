package main.MapConcept;

import java.util.*;

public class MapMethodsExample {
    public static void main(String[] args) {
        Map<Character,String> alphabets = new HashMap();
        alphabets.put('A',"Apple");
        alphabets.put('B',"Banana");
        alphabets.put('C',"Chickoo");
        alphabets.put('D',"Dragon Fruit");
//        Searching for specific key
        boolean keyExists = alphabets.containsKey('A');
        System.out.println("Key A Exists ? "+keyExists);

        keyExists = alphabets.containsKey('E');
        System.out.println("Key E Exists ? "+keyExists);
//        Searching for specific value
        boolean valueExists = alphabets.containsValue("Apple");
        System.out.println("Apple value exists ? "+valueExists);

        valueExists = alphabets.containsValue("Kiwi");
        System.out.println("Kiwi value exists ? "+valueExists);

        Set<Map.Entry<Character,String>> alphabetsEntry = alphabets.entrySet();
        boolean isAlphabetsEntryEmpty = alphabetsEntry.isEmpty();
        System.out.println("isAlphabetsEntryEmpty ? "+isAlphabetsEntryEmpty);

        Iterator<Map.Entry<Character,String>> iterator = alphabetsEntry.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Object fruits = new HashMap<>(Map.of('A',"Apple",'B',"Banana",'C',"Chickoo",'D',"Dragon Fruit"));
        boolean isMapEqualToObject = alphabets.equals(fruits);
        System.out.println("isMapEqualToObject ? "+isMapEqualToObject);

        String apple = alphabets.get('A');
        System.out.println("A: "+apple);

        String banana = alphabets.get('B');
        System.out.println("B: "+banana);

        Set<Character> alphabetKeys = alphabets.keySet();
        for (char alphabet:alphabetKeys)
            System.out.print(alphabet+" : "+alphabets.get(alphabet)+"\t");

        System.out.println("\n"+"--Fruits Collection--");
        Collection<String> fruitsCollection =  alphabets.values();
        Iterator<String> fruitsIterator = fruitsCollection.iterator();
        while (fruitsIterator.hasNext())
            System.out.print(fruitsIterator.next()+"\t");
    }
}
