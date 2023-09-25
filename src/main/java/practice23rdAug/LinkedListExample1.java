package practice23rdAug;

import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
        LinkedList<String> wordList = new LinkedList<>();
        System.out.println("--Initial List--");
        System.out.println(wordList);
        wordList.offerFirst("Java");
        wordList.offerLast("Programming");
        wordList.add(2, "is");
        System.out.println("--After Adding Few Elements--");
        System.out.println(wordList);
        wordList.remove(2);
        System.out.println("--After removing element at index 2");
        System.out.println(wordList);
        System.out.println("Is List Empty ? : "+wordList.isEmpty());
        wordList.forEach(word -> System.out.print(word + "\t"));
    }
}
