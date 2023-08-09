package interviewQuestions;

public class ExceptionExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int[] num = new int[3];
        try {
            System.out.println("Dividing " + a + " by " + b + " gives : " + (a / b));
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Value : " + num[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("Done .. ");
    }
}
