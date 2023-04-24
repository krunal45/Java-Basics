package collectionBasics;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
//        HashMap<Integer, String> students = new HashMap<>();
//        students.put(1, "Adam");
//        students.put(2, "Bob");
//        students.put(3, "Cherry");
//        students.put(4, "David");

//        Using For Each Loop
//        for (int studentID : students.keySet()) {
//            System.out.println(studentID + " :" + students.get(studentID));
//        }

//      Using the iterator
//        Iterator<Map.Entry<Integer, String>> it = students.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry<Integer, String> student = it.next();
//            System.out.println(student.getKey() + " :" + student.getValue());
//        }

//        Using lambda
//        students.forEach((k, v) -> System.out.println("Student ID :" + k + " Student Name :" + v));

//        Comparing 2 HashMaps
        HashMap<Integer, String> studentList1 = new HashMap<>();
        studentList1.put(1, "Adam");
        studentList1.put(2, "Bob");
        studentList1.put(3, "Cherry");
        studentList1.put(4, "David");

        HashMap<Integer, String> studentList2 = new HashMap<>();
        studentList2.put(1, "Adam");
        studentList2.put(2, "Bob");
        studentList2.put(3, "Cherry");
        studentList2.put(4, "David");
        studentList2.put(4, "Robert");

        System.out.println("Is both Student List Equal :" + studentList1.equals(studentList2));

        Set<String> s1 = new HashSet<>(studentList1.values());
        s1.addAll(studentList2.values());
        s1.removeAll(studentList1.values());
        System.out.println("Student absent in list1 :" + s1);

//        Duplicate values are restricted in Set
        Set<Character> set1 = new HashSet<>(Arrays.asList('a', 'b', 'c', 'a'));
        set1.forEach(System.out::println);
    }
}
