package interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class primeNumberCheckFromList {

    static boolean isNumberPrime(int number) {
        if (number > 1) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    static List<Integer> getPrimeNumbersList(List<Integer> numbers) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (isNumberPrime(number))
                primeNumbers.add(number);
        }
        return primeNumbers;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        System.out.println("Prime Numbers from list > " + numbers + " is > " + getPrimeNumbersList(numbers));
    }
}