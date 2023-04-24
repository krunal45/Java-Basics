package collectionBasics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetExample {
    public static void main(String[] args) {
//        Set<Integer> evenNumbers = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10));
//        System.out.println(evenNumbers);
//        evenNumbers.addAll(Arrays.asList(12, 14, 16));
//        System.out.println(evenNumbers);
//
//        Set<Integer> oddNumbers = new HashSet<>(Arrays.asList(1, 3, 5, 7));
//        Union
//        evenNumbers.addAll(oddNumbers);
//        System.out.println(evenNumbers);
        //Intersection
//        evenNumbers.removeAll(oddNumbers);
//        System.out.println(evenNumbers);
//        Won't allow duplicate Numbers
//        evenNumbers.add(2);
//        System.out.println(evenNumbers)


//        System.out.println("---");
//        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//        Set<Integer> oddNumbers1 = numbers.stream().filter(num -> num % 2 != 0).collect(Collectors.toSet());
//        oddNumbers1.forEach(System.out::println);
//        System.out.println("---");
//        Set<Integer> evenNumbers1 = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toSet());
//        evenNumbers1.forEach(System.out::println);

        Set<String> alphabets = new HashSet<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "I", "I", "O", "U"));
        Set<String> finalVowels;
        finalVowels = alphabets.stream().filter(ch -> (ch.equals("A") | ch.equals("E") | ch.equals("I") | ch.equals("O") | ch.equals("U"))).collect(Collectors.toSet());
        System.out.println(finalVowels);

        Set<String> finalConsonents;
        finalConsonents = alphabets.stream().filter(ch -> !(ch.equals("A") | ch.equals("E") | ch.equals("I") | ch.equals("O") | ch.equals("U"))).collect(Collectors.toSet());
        finalConsonents.forEach(System.out::println);
    }
}
