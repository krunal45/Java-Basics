package main.LinkedList_Implementation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList_Methods {

    static void printList(LinkedList<Character> characterLinkedList){
        characterLinkedList.forEach(character -> System.out.print(character+" > "));
        System.out.println();
    }

    static boolean containsCharacter(Character characterToSearch,LinkedList<Character> list){
        return list.contains(characterToSearch);
    }

    public static void main(String[] args) {
        LinkedList<Character> moreCharacters = new LinkedList<>(List.of('D','E','F'));
        LinkedList<Character> characters = new LinkedList<>();
        characters.add(0, 'B');
        characters.add(0, 'A');
        boolean flag = characters.add('C');
        System.out.println("Added Element > "+flag);

        boolean moreCharsAdded = characters.addAll(moreCharacters);
        System.out.println("moreCharsAdded > "+moreCharsAdded);

        characters.addFirst('a');
        characters.addFirst('a');
        characters.addLast('f');
        characters.addLast('f');
        printList(characters);

        System.out.println("After Copy > ");
        Object charactersCopy = characters.clone();
        System.out.println(charactersCopy.toString());

        System.out.println("Contains Character > "+containsCharacter('a', characters));

        Iterator<Character> reverseCharacters = characters.descendingIterator();
        while (reverseCharacters.hasNext()){
            System.out.print(reverseCharacters.next()+" > ");
        }
        System.out.println();
        Character headOfCharacters = characters.element();
        System.out.println("head is > "+headOfCharacters);

        Character characterAtPosition5 = characters.get(5);
        System.out.println("characterAtPosition5 > "+characterAtPosition5);

        Character firstCharacter = characters.getFirst();
        System.out.println("firstCharacter > "+firstCharacter);

        Character lastCharacter = characters.getLast();
        System.out.println("lastCharacter > "+lastCharacter);

        int index = characters.indexOf('a');
        System.out.println("index of a character > "+index);

        int index1 = characters.lastIndexOf('f');
        System.out.println("Last Index of f > "+index1);

        ListIterator<Character> listIterator = characters.listIterator(5);
        while (listIterator.hasNext()){
            System.out.print(listIterator.next()+" > ");
        }
        System.out.println();

        boolean elementAdded = characters.offer('G');
        System.out.println("elementAdded > "+elementAdded);
        printList(characters);

        elementAdded = characters.offerFirst('Q');
        System.out.println("elementAdded at start > "+elementAdded);
        printList(characters);

        elementAdded = characters.offerLast('h');
        System.out.println("elementAdded at end > "+elementAdded);
        printList(characters);

        characters.removeFirst();
        printList(characters);
//        characters.clear();
//        System.out.println("-- - After Clear -- - ");
//        printList(characters);
    }
}