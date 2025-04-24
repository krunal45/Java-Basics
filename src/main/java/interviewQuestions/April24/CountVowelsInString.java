//🔁 Question 1: Count Vowels in a String
//Write a method that takes a String as input and returns the number of vowels (a, e, i, o, u, case-insensitive) in it.
//
//Use a for loop to iterate through the string.
package interviewQuestions.April24;

public class CountVowelsInString {
    static int countVowels(String name){
        int count = 0;
        String input = name.toLowerCase();
        for (int i =0;i<name.length();i++){
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' ||  input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u' )
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String names[] = {"Test","Automation","Ajay","Rajkot"};
        for (String name:names)
            System.out.println(name+" : "+countVowels(name));
    }
}