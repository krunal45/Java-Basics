/*
I'd be glad to act as your Java tutor!

Here's a beginner-level coding question based on the `while` loop:

**Challenge:**

Write a Java program that prints all the even numbers from 10 down to 2 (inclusive). Use a `while` loop to achieve this.

**Tips:**

* You'll need a variable to keep track of the current number.
* The `while` loop will continue as long as your condition is true.
* Inside the loop, you'll need to:
    * Check if the current number is even. You can use the modulo operator (`%`) to do this.
    * If it's even, print the number.
    * Update the variable to move to the next number (hint: subtract 2).

**Remember:**

I haven't provided the solution yet so you can try solving it yourself. If you get stuck, feel free to ask for further guidance!
 */
package loop;

public class WhileLoopBeginnerExample1 {
    public static void main(String[] args) {
        int i = 10;
        while (i >= 2) {
            if (i % 2 == 0)
                System.out.println(i);
            i = i - 1;
        }
    }
}