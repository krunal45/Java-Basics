package collectionBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {

    public static void main(String[] args) {
//        ArrayList<Object> studentDetails = new ArrayList<>();
//        studentDetails.add("Name: Krunal");
//        studentDetails.add("Age: " + 31);
//        studentDetails.add("Standard: 1st");
//
//        ArrayList<String> employees = new ArrayList<>(Arrays.asList("Joy", "Tom", "Peter"));
//
//        //For-each loop
//        System.out.println("Using For Each Loop");
//        for (Object student : studentDetails) {
//            System.out.println(student.toString());
//        }
//
//        //Stream
//        System.out.println("Using stream");
//        studentDetails.forEach(System.out::println);
//
//        System.out.println("Printing Employee List");
//        employees.forEach(System.out::println);

//        Various methods supported by ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
//        numbers.removeIf(num -> num % 2 != 0);
//        System.out.println(numbers);

//        ArrayList<String> names = new ArrayList<>(Arrays.asList("Apple", "Banana", "Chickoo", "Apple"));
//        names.retainAll(Collections.singleton("Apple"));
//        System.out.println(names);

//        ArrayList<Integer> subListNumbers = new ArrayList<>(numbers.subList(0, 3));
//        System.out.println(subListNumbers);
//
//        Object[] numbersArr = subListNumbers.toArray();
//        System.out.println(Arrays.toString(numbersArr));
//
//        for (Object o : numbersArr) {
//            System.out.println(o);
//        }

        ArrayList<String> name1 = new ArrayList<>(Arrays.asList("Joy", "Robert", "Peter"));
        ArrayList<String> name2 = new ArrayList<>();
//        name2.addAll(name1);
//        System.out.println(name2);
//        name2.addAll(1, name1);
//        System.out.println(name2);
//        name2.clear();
//        System.out.println(name2);

        name2 = (ArrayList<String>) name1.clone();
        System.out.println(name2);
    }
}
