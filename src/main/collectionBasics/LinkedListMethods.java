package main.collectionBasics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.addFirst("Apple");
        fruits.addLast("Chickoo");
        System.out.printf("List size :" + fruits.size());
        System.out.printf("Fruits : " + fruits);
        fruits.removeFirst();
        fruits.removeLast();
        System.out.println("Fruits : " + fruits);

        List<String> moreFruits = new LinkedList<>();
        moreFruits.add("Cherry");
        moreFruits.add("Kiwi");
        fruits.addAll(moreFruits);
        System.out.println("Fruits : " + fruits);

//        Reversing fruits order
        Iterator<String> reverseFruitsOrder = fruits.descendingIterator();
        while (reverseFruitsOrder.hasNext()) {
            System.out.println(reverseFruitsOrder.next());
        }

        fruits.forEach(System.out::println);
        moreFruits.removeAll(fruits);
        System.out.println("After Removing ---- ");
        moreFruits.forEach(System.out::println);

        String firstElement=fruits.element();
        System.out.println("First Element : "+firstElement);

        boolean isBananaPresent=fruits.contains("Banana");
        System.out.println("isBananaPresent :"+isBananaPresent);
        boolean isWatermelonPresent=fruits.contains("Watermelon");
        System.out.println("isWatermelonPresent :"+isWatermelonPresent);

        fruits.offer("Watermelon");
        isWatermelonPresent=fruits.contains("Watermelon");
        System.out.println("isWatermelonPresent :"+isWatermelonPresent);

        fruits.offerFirst("Apple");
        boolean valAdded=fruits.offerLast("DragonFruit");
        System.out.println("----");
        fruits.forEach(System.out::println);

        System.out.println("---");
        System.out.println("valAdded : "+valAdded);
    }
}