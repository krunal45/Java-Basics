
//**Interview Question:**
//
//You are given a string:
//
//```java
//String input = "This is a test This test is only a test";
//```
//
//**Task:**
//Write a Java method that removes duplicate words from the string while preserving the original order of first occurrences.
// Words are separated by spaces.
//
//**Requirements:**
//
//* The comparison should be **case-sensitive** (i.e., "This" and "this" are different).
//* You may assume punctuation does not need to be handled.
//* Return the result as a single string, with words separated by a single space.
//
//**Expected Output for the Example Input:**
//`"This is a test only"`
//
//---
//
//Would you like a sample solution as well?
package interviewQuestions.May9;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

    static String removeDuplicateWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "";
        }
        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(input.split(" ")));
        return String.join(" ", uniqueWords);
    }

    public static void main(String[] args) {
        String[] inputArray = {
                "This is a test This test is only a test",
                "Hello world Hello universe Hello",
                "Java Python C++ Java JavaScript Python",
                "one two three four five six",
                "Repeat repeat Repeat repeat REPEAT repeat"
        };
        for (String input : inputArray) {
            System.out.println("input: " + input);
            System.out.println("output: " + removeDuplicateWords(input));
        }
    }
}