package Hashtable;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> numbers = new Hashtable<>();
//        initial size
        int size = numbers.size();
        System.out.println("size : " + size);
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(4, "Four");
//        Checking if hashtable contains 'One'
        boolean flag = numbers.contains("One");
        System.out.println("contains One ? " + flag);
        //        Checking if hashtable contains 'Five'
        flag = numbers.contains("Five");
        System.out.println("contains Five ? " + flag);
//        alternative to 'contains()'
        flag = numbers.containsValue("One");
        System.out.println("contains One ? " + flag);
//        Verifying if key = 1 exists ?
        flag = numbers.containsKey(1);
        System.out.println("key = 1 exists ? "+flag);
        //        Verifying if key = 5 exists ?
        flag = numbers.containsKey(5);
        System.out.println("key = 5 exists ? "+flag);
//        Fetching value 1 from table
        String value = numbers.get(1);
        System.out.println(" 1: "+value);
//        Fetching value 5 from table which do not exist
        value = numbers.get(5);
        System.out.println(" 5: "+value);
//        Verifying if table is empty:
        flag = numbers.isEmpty();
        System.out.println("Is Table Empty ? "+flag);
//        Remove key = 1 from table
        flag = numbers.remove(1,"One");
        System.out.println("Removed key = 1 from table ? "+flag);
        //        Remove key = 5 from table
        flag = numbers.remove(5,"Five");
        System.out.println("Removed key = 5 from table ? "+flag);
//        Cloning table
        Hashtable<Integer, String> copyOfNumbers = (Hashtable<Integer, String>) numbers.clone();
        System.out.println(copyOfNumbers);
        copyOfNumbers.put(1, "One");
        System.out.println(copyOfNumbers);
        for (int key: copyOfNumbers.keySet())
            copyOfNumbers.computeIfPresent(key, (k,v)->v.toUpperCase());
        System.out.println(copyOfNumbers);
    }
}
