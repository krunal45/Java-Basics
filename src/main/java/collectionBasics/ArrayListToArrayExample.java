package collectionBasics;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArrayExample {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(3,4);
        System.out.println("Size of integers ArrayList: "+integers.size());
        System.out.println("Integers: "+integers);

        Integer[] integerArray = integers.toArray(new Integer[0]);
        int sum = 0;
        for (int integer:integerArray)
            sum = sum + integer;
        System.out.println("Sum of "+ Arrays.toString(integerArray) +" is: "+sum);
    }
}
