//❓ Question 1: Grade Calculator
//Write a method that takes an int score (0–100) and returns:

//"A" if score >= 90
//
//"B" if score >= 80
//
//"C" if score >= 70
//
//"D" if score >= 60
//
//"F" otherwise
//
//Use nested ternary operators only (no if, switch, or else).
package main.interviewQuestions.April24;

public class GradeCalculator {

    static char returnGrade(int marks) {

            return (marks >= 90) ? 'A' :
                    (marks >= 80) ? 'B' :
                            (marks >= 70) ? 'C' :
                                    (marks >= 60) ? 'D' : 'F';
    }

    public static void main(String[] args) {
        int testScores[] = {90, 91, 80, 81, 79, 70, 71, 60, 61, 59,101};
        for (int mark : testScores)
            System.out.println("Score: "+mark+" Grade: "+returnGrade(mark));
    }
}