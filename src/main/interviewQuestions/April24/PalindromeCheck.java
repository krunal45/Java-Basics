//❓ Question 3: Palindrome Check
//Write a method that checks if a given string is a palindrome (reads the same forward and backward). Ignore case and spaces.
package main.interviewQuestions.April24;

public class PalindromeCheck {

    static  String reverse(String name){
        StringBuilder reversed = new StringBuilder();
        for (int i = name.length()-1;i>=0;i--){
            reversed.append(name.charAt(i));
        }
        return reversed.toString();
    }

    static  boolean isPalindrome(String name){
        String cleaned = name.replaceAll("\\s+", "").toLowerCase();
         return cleaned.equalsIgnoreCase(reverse(cleaned));
    }

    public static void main(String[] args) {
        String testCases[] = {"Madam","Test123","Panama","Mama","A man a plan a canal Panama"};
        for (String test:testCases)
            System.out.println(test+ " : "+isPalindrome(test));
    }
}