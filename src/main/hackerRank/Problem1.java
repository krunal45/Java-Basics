package main.hackerRank;

import java.util.Scanner;

public class Problem1 {

    static int getInput(String val) {
        int num = 0;
        System.out.println("Enter Input for:" + val);
        Scanner input = new Scanner(System.in);
        switch (val) {
            case "q" -> {
                num = input.nextInt();
                if (!(num >= 0 && num <= 500)) {
                    System.out.println("Value of " + val + " should be between 0 - 500. Please enter correct input.");
                    num = getInput(val);
                }
            }
            case "a", "b" -> {
                num = input.nextInt();
                if (!(num >= 0 && num <= 50)) {
                    System.out.println("Value of " + val + " should be between 0 - 50. Please enter correct input.");
                    num = getInput(val);
                }
            }
            case "n" -> {
                num = input.nextInt();
                if (!(num >= 0 && num <= 15)) {
                    System.out.println("Value of " + val + " should be between 0 - 15. Please enter correct input.");
                    num = getInput(val);
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int q, a, b, n;
        q = getInput("q");

        for (int i = 0; i < q; i++) {
            a = getInput("a");
            b = getInput("b");
            n = getInput("n");

            for (int j=1;j<=n;j++){
                int s = (a+((int)Math.pow(2, j-1)*b));
                System.out.print(s+"\t");
            }
            System.out.print("\n");
        }
    }
}
