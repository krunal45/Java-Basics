//❓ Question 1: Pass or Fail
//Write a method that takes a student's score as an int and returns "Pass" if the score is greater than or equal to 40,
// otherwise returns "Fail". Use the ternary operator to implement this.
package main.interviewQuestions.April24;

public class CheckStudentResult {

    static String getStudentResult(int marks) {
        return marks >= 40 ? "Pass" : "Fail";
    }

    public static void main(String[] args) {
        int[] tests = {39,40,41,55,100,21};
        for (int test:tests)
            System.out.println("Is Student passed? " + getStudentResult(test));
    }
}