package main.collectionBasics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionMethodsExample1 {
    static boolean isElementAdded, duplicateAllowed, isElementRemoved;
    List<Character> list = new ArrayList<>(List.of('A', 'B', 'C', 'D'));

    public static void main(String[] args) {
        Collection<Character> alphabets = new ArrayList<>();
        isElementAdded = alphabets.add('A');
        System.out.println("isElementAdded: " + isElementAdded);
        duplicateAllowed = alphabets.add('A');
        System.out.println("duplicateAllowed: " + duplicateAllowed);
        Collection<Character> moreAlphabets = new ArrayList<>(List.of('B', 'C', 'D'));
        System.out.println(" --Adding More Alphabets-- " + moreAlphabets);
        isElementAdded = alphabets.addAll(moreAlphabets);
        System.out.println("alphabets > " + alphabets);
        System.out.println("Removing all elements > ");
        System.out.println("alphabets contains A ? " + alphabets.contains('A'));
        System.out.println("alphabets contains E ? " + alphabets.contains('E'));
        System.out.println("alphabets contains " + moreAlphabets + " ? " + alphabets.containsAll(moreAlphabets));
        boolean isListEqual = alphabets.equals(new CollectionMethodsExample1().list);
        System.out.println("isListEqual ? " + isListEqual);
        System.out.println("is alphabets collection Empty ? " + alphabets.isEmpty());
//        alphabets.clear();
        System.out.println("alphabets > " + alphabets);
        System.out.println("is alphabets collection Empty ? " + alphabets.isEmpty());
        Iterator<Character> characterIterator = alphabets.iterator();
        while (characterIterator.hasNext()) {
            System.out.println(characterIterator.next());
        }
        isElementRemoved = alphabets.remove('A');
        System.out.println("Is Character A Removed: "+isElementRemoved);
        System.out.println("--After Removing character A-- \n"+alphabets);
        isElementRemoved = alphabets.removeAll(moreAlphabets);
        System.out.println("Are all characters "+moreAlphabets+" removed ? "+isElementRemoved);
        System.out.println("--After Removing all elements--");
        System.out.println(alphabets);
        System.out.println("Adding back "+moreAlphabets);
        isElementAdded = alphabets.addAll(moreAlphabets);
        System.out.println("isElementAdded ? "+isElementAdded);
        System.out.println(alphabets);
        System.out.println("Removing all alphabets apart from "+moreAlphabets);
        isElementRemoved = alphabets.retainAll(moreAlphabets);
        System.out.println(alphabets);
        System.out.println("Number of Elements in alphabets: "+alphabets.size());
        Character[] charArray = alphabets.toArray(new Character[0]);
        for (Character character:charArray){
            System.out.print(character+"\t");
        }
    }
}
