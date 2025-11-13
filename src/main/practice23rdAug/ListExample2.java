package main.practice23rdAug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>(Arrays.asList(2,4,6));
        System.out.println("--Before adding number--");
        System.out.println(numberList);
        numberList.add(42);
        System.out.println("--After adding number--");
        System.out.println(numberList);
        numberList.add(2, 99);
        System.out.println(numberList);
        System.out.println("--Removing Element--");
        numberList.remove(4);
        System.out.println(numberList);
        System.out.println("--List Contains value 17-- : "+numberList.contains(17));
        System.out.println("--Adding value 17-- : ");
        numberList.add(17);
        System.out.println("--List Contains value 17-- : "+numberList.contains(17));
        numberList.forEach(n -> System.out.print(n + "\t"));
    }
}
