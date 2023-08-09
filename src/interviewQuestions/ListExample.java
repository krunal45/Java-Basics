package interviewQuestions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Krunal");
        names.add("Jay");
        names.add("Jayesh");
        names.add("Alok");

        System.out.println("Collection size : " + names.size());
        System.out.println("Collection contains :Krunal  " + names.contains("Krunal"));
        System.out.println("Is Collection Empty : " + names.isEmpty());
        for (String name : names) {
            System.out.println("Name : " + name);
        }

        List<String> names1 = new ArrayList<>();
        names1.add("Apple");
        names1.add("Banana");
        names1.add("Cherry");


        System.out.println("--list--");
        for (int i = 0; i < names1.size(); i++) {
            System.out.println(names1.get(i));
        }
    }
}
