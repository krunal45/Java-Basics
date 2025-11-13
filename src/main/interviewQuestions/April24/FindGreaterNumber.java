//❓ Question 2: Find Maximum of Two Numbers
//Write a method that takes two integers and returns the greater of the two using the ternary operator.

package main.interviewQuestions.April24;

public class FindGreaterNumber {
    static int findGreaterNumber(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("Greater number :" + findGreaterNumber(30, 20));
    }
}
