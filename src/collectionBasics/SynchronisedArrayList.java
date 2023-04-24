package collectionBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronisedArrayList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Tom", "Peter", "Adam"));
        Collections.synchronizedList(students);

        synchronized (students) {
            Iterator<String> it = students.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }

        CopyOnWriteArrayList<String> employees = new CopyOnWriteArrayList<>(Arrays.asList("Gaurav", "Anjali", "Tarun"));
        employees.forEach(System.out::println);
    }
}