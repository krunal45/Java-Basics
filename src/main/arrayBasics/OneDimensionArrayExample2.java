/*
Here’s an intermediate-level coding question based on the 1D array concept:

**Question:**

Given a 1D array of integers, write a function to find the second largest number in the array. If the array has fewer than two unique numbers, return `null`.

**Example:**
```javascript
Input: [10, 20, 4, 45, 99]
Output: 45

Input: [4, 4, 4, 4]
Output: null

Input: [1]
Output: null
```

**Constraints:**
- The array may contain duplicate numbers.
- You are expected to handle edge cases such as arrays with fewer than two elements.

Take 5 minutes to solve this!
*/
package main.arrayBasics;

import java.util.*;

public class OneDimensionArrayExample2 {

    int[] takeUserInput() {
        Scanner input = new Scanner(System.in);
        int size = 0;
        while (size <= 1) {
            System.out.println("Enter array Size");
            size = input.nextInt();
            if (size < 2)
                System.out.println("Invalid Input. Please enter array size > 1");
        }
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number " + (i + 1));
            numbers[i] = input.nextInt();
        }
        return numbers;
    }

    Set<Integer> removeDuplicateNumbers(int[] numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (Integer number : numbers)
            uniqueNumbers.add(number);
        if (uniqueNumbers.size() < 2) {
            return null;
        } else {
            return uniqueNumbers;
        }
    }

    Integer findSecondLargestNumber(Set<Integer> numbers) {
        Set<Integer> numbers1 = new TreeSet<>(numbers);
        int count = 0;
        for (Integer number : numbers1) {
            count++;
            if (count == 2)
                return number;
        }
        return null;
    }


    public static void main(String[] args) {
        OneDimensionArrayExample2 user1 = new OneDimensionArrayExample2();
        int[] numbers = user1.takeUserInput();//Taking user input
        Set<Integer> uniqueNumbers = user1.removeDuplicateNumbers(numbers);
        System.out.println("Second Largest Number is: "+user1.findSecondLargestNumber(uniqueNumbers));
    }
}