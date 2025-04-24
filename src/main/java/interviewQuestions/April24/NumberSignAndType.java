//❓ Question 2: Number Sign and Type
//Write a method that takes an int and returns:
//
//"Positive Even" if number is > 0 and even
//
//"Positive Odd" if > 0 and odd
//
//"Negative" if < 0
//
//"Zero" if it's exactly 0
//
//Use only nested ternary operators.
package interviewQuestions.April24;

public class NumberSignAndType {

    static String getNumberSignAndType(int num) {
        return (num > 0 && num % 2 == 0) ? "Positive Even" :
                (num > 0) ? "Positive Odd" :
                        (num < 0) ? "Negative" : "Zero";
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 7, 8, -1, -3, 0};
        for (int num : nums)
            System.out.println(num + " : " + getNumberSignAndType(num));
    }
}
