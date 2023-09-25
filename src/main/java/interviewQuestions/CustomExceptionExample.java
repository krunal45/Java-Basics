package interviewQuestions;

class KrunalException extends Exception {
    KrunalException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        try {
            System.out.println(" Result : " + a / b);
            if (a / b == 1)
                throw new KrunalException("Denominator cannot be zero.");
        } catch (KrunalException e) {
            System.out.println(" Done . " + e);
        } catch (ArithmeticException w) {

        }
    }
}
