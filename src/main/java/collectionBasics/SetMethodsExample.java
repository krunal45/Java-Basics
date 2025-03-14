package collectionBasics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

public class SetMethodsExample {
    static boolean elementAdded;
    public static void main(String[] args) {
        Set<Character> characterSet = new HashSet<>();
        elementAdded = characterSet.add('A');
        System.out.println("First Element Added ? "+elementAdded);
        elementAdded = characterSet.add('A');
        System.out.println("Duplicate element allowed ? "+elementAdded);
        Set<Character> moreCharacters = new HashSet<>(Set.of('B','C','D'));
        characterSet.addAll(moreCharacters);
        System.out.println(characterSet);
        System.out.println("Set contains 'A' ? "+characterSet.contains('A'));
        System.out.println("Set contains 'E' ? "+characterSet.contains('E'));
        System.out.println("Is Set Empty ? "+characterSet.isEmpty());

//        Iterator
        Iterator<Character> characterIterator = characterSet.iterator();
        while (characterIterator.hasNext()){
            System.out.print(characterIterator.next()+"\t");
        }
        System.out.println();

//        Removing Object
        System.out.println("Removing character B");
        characterSet.remove('B');
        System.out.println(characterSet);

        //    Size of Set
        System.out.println("Size of Set: "+characterSet.size());

        Spliterator<Character> splitSet = characterSet.spliterator();

        splitSet.tryAdvance(System.out::println);
        splitSet.forEachRemaining(System.out::println);
    }


}
