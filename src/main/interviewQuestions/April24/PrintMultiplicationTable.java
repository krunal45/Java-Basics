//🔁 Question 2: Print Multiplication Table
//Write a method that takes a number n and prints its multiplication table up to 10.
//
//Use a for loop to generate and print the output.
package main.interviewQuestions.April24;

public class PrintMultiplicationTable {

    static void printTable(int number){
        for (int i=1;i<=10;i++){
            System.out.println(number+" x "+i+" = "+(i*number));
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5};
        for (int num:nums)
            printTable(num);
    }
}