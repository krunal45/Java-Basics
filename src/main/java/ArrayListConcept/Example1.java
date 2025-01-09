package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;

public class Example1 {
    public static void main(String[] args) {
        //Add Element
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);

        //Get Element
        int element1 = list1.get(0);
        System.out.println(element1);

        //Add Element at specific index
        list1.add(1, 2);
        System.out.println(list1);

        //set Element
        list1.set(0, 5);
        System.out.println(list1);

        //delete Element
        list1.remove(3);
        System.out.println(list1);

        //sorting elements
        Collections.sort(list1);
        System.out.println(list1);

        //looping elements
        for (int element:list1)
            System.out.println(element);
    }
}
