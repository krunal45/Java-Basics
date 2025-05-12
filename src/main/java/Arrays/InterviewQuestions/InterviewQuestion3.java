//**Problem:**
//Write a Java method called `sumOfRow` that takes a 2D integer array and an integer representing a row index as input.
// The method should return the sum of all the elements in that specific row. If the provided row index is out of bounds
// (less than 0 or greater than or equal to the number of rows in the array), the method should return 0.
package Arrays.InterviewQuestions;

public class InterviewQuestion3 {

    static int getSumOfRows(int[][] input,int inputRow) {
        if (inputRow < 0 || inputRow>=input.length){
            return 0;
        }

        int sum = 0;
        for (int row = inputRow; row <= inputRow; row++) {
            for (int col = 0; col < 3; col++) {
                sum = sum + input[row][col];
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] input = new int[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                input[row][col] = (int) (Math.random() * 10);
                System.out.print(input[row][col]+"\t");
            }
            System.out.println();
        }
        int sum;
        sum = getSumOfRows(input,0);
        System.out.println("sum: "+sum);
    }
}