package collectionBasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

public class ListMethodsExample {
    static boolean elementAdded, elementPresent;

    public static void main(String[] args) {
        List<Character> alphabets = new ArrayList<>();
        elementAdded = alphabets.add('A');
        System.out.println("Character A Added > " + elementAdded);
        alphabets.add('C');
        alphabets.add(1, 'B');
        List<Character> moreAlphabets = new ArrayList<>(List.of('C','D', 'E', 'F'));
        alphabets.addAll(moreAlphabets);
        elementPresent = alphabets.contains('A');
        System.out.println("Contains Character A ? "+elementPresent);
        elementPresent = alphabets.contains('G');
        System.out.println("Contains Character G ? "+elementPresent);
        elementPresent = new HashSet<>(alphabets).containsAll(moreAlphabets);
        System.out.println("Alphabets contains characters "+moreAlphabets+" ? "+elementPresent);
        System.out.println("Element at position 0: "+alphabets.get(0));
        System.out.println("First Occurence of character C: "+alphabets.indexOf('C'));
        System.out.println("Is alphabets list empty ? "+alphabets.isEmpty());
        System.out.println("Last Occurence of character C: "+alphabets.lastIndexOf('C'));
        ListIterator<Character> characterListIterator = alphabets.listIterator();
        while (characterListIterator.hasNext()){
            System.out.print(characterListIterator.next()+"\t");
        }
        System.out.println();
        ListIterator<Character> characterListIteratorStartingFromIndex2 = alphabets.listIterator(2);
        while (characterListIteratorStartingFromIndex2.hasNext()){
            System.out.print(characterListIteratorStartingFromIndex2.next()+"\t");
        }
        System.out.println();
        System.out.println("--Removing element at index 2--");
        alphabets.remove(2);
        System.out.println(alphabets);
        alphabets.set(1, 'X');
        System.out.println("Replacing element at position 1 with 'X'");
        System.out.println(alphabets);
        List<Character> subList = new ArrayList<>();
        subList = alphabets.subList(2, 5);
        System.out.println("Sublist starting from index 2:"+subList);
    }
}
