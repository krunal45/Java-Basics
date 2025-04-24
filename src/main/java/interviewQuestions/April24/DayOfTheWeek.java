//🔁 Question 1: Day of the Week
//Write a method that takes an integer from 1 to 7 and returns the name of the corresponding day of the week.
//
//1 = Sunday
//
//2 = Monday
//
//...
//
//7 = Saturday
//
//For any invalid input (e.g., 0, 8), return "Invalid day".
//
//Use a switch-case statement.
package interviewQuestions.April24;

public class DayOfTheWeek {

    static String getDay(int num) {
        return  switch (num) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid day";
        };
    }

    public static void main(String[] args) {
        int days[] = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        for (int day : days)
            System.out.println("Day " + day + " : " + getDay(day));
    }
}
