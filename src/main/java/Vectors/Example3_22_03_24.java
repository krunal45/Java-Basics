package Vectors;

import java.util.Vector;

public class Example3_22_03_24 {

    public static void main(String[] args) {
        Vector<String> names = new Vector<>(10);
        names.add("Apple");
        names.add("Banana");
        names.add("Chickoo");
        names.add("Dragon");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("----");
        System.out.println("1:" + names.get(0));
        System.out.println("3:" + names.get(2));
        names.add(4, "Elephant");
        System.out.println("----");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("----");
        names.add(5, String.valueOf(1));
        System.out.println("5:" + names.get(5));
        System.out.println("Size of Vector names:" + names.size());
        names.add("Dolphin");
        names.add("Crocodile");
        names.add("Om");
        names.add("2");
        names.add("a");
        System.out.println("----");
        names.forEach(System.out::println);
        System.out.println("----");
        System.out.println("Capacity of Vector is :"+names.capacity());
        System.out.println("----");
        System.out.println("11:" + names.elementAt(10));
    }
}
