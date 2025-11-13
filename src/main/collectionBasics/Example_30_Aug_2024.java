/*
Sure! Here’s an intermediate-level Java question based on the `Collections` framework:

**Question:**

You are given a list of strings representing book titles. Write a Java program to find the top 3 most frequently occurring words in these book titles,
ignoring common stop words like "the," "is," "in," "and," etc. The program should output the top 3 words along with their frequencies in descending order.

**Requirements:**
1. Use `Collections` framework classes such as `List`, `Map`, and `Set`.
2. Use a `Map` to keep track of word frequencies.
3. Use a `List` to store and sort the entries by frequency.
4. Filter out common stop words like "the," "is," "in," "and," etc., from your results.

**Example Input:**
```java
List<String> bookTitles = Arrays.asList(
    "The Great Gatsby",
    "To Kill a Mockingbird",
    "Pride and Prejudice",
    "The Catcher in the Rye",
    "The Hobbit"
);
```

**Example Output:**
```
the: 3
great: 1
gatsby: 1
```

Feel free to give it a try! If you need hints or want to discuss your approach, let me know!
 */
package main.collectionBasics;

import java.util.*;

public class Example_30_Aug_2024 {

    public static List<Map.Entry<String, Integer>> getBooksWithFrequency(List<String> books) {
        StringBuilder booksBuilder = new StringBuilder();
        for (String book : books) {
            booksBuilder.append(book).append("-");
        }

        String booksString = booksBuilder.toString().replace(" ", "-");
        String[] words = booksString.split("-");

        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty() && !isCommonWord(word)) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> wordWithHighFrequency = new ArrayList<>(wordFrequency.entrySet());
        wordWithHighFrequency.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        return wordWithHighFrequency;
    }

    private static boolean isCommonWord(String word) {
        return word.equalsIgnoreCase("the") ||
                word.equalsIgnoreCase("is") ||
                word.equalsIgnoreCase("in") ||
                word.equalsIgnoreCase("and");
    }

    public static void main(String[] args) {
        List<String> books = new ArrayList<>(List.of(
                "The Girl on the Train",
                "The Girl with the Dragon Tattoo",
                "The Hunger Games",
                "The Maze Runner",
                "The Girl Who Kicked the Hornet's Nest"
        ));

        List<Map.Entry<String, Integer>> list = Example_30_Aug_2024.getBooksWithFrequency(books);

        // Ensure there are at least 3 entries to avoid IndexOutOfBoundsException
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            System.out.println("word: " + list.get(i).getKey() + " Frequency:" + list.get(i).getValue());
        }
    }
}
