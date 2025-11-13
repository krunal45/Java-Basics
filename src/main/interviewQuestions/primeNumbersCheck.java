package main.interviewQuestions;

public class primeNumbersCheck {

    public static boolean isNumberPrime(int num) {
        boolean flag = false;
        if (num != 2) {
            flag = num % 2 != 0;
        }
        else if (num == 2) {
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(isNumberPrime(1213));
    }

}
