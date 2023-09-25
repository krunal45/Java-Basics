package interviewQuestions;
/*
Find the least number of steps necessary to reach the end of array.
a. For example, array is arr[]= {1,3,4,7,9,4,2,1,5,8,6}. If you are on arr[0]
and element value is 1, you can jump max 1 step. If you are on arr[1]
and element value is 3, you can jump max 3 steps reaching arr[4]. Find
the lowest number of steps needed to reach the end of array.
b. If you reach an element where the element value is 0, you cannot jump
to the next element.
c. If the end of array cannot be reached, return "–1"
*/


public class ArrayInterviewQuestion {

    public int getSteps(int[] arr) {

        int end = arr.length - 1;
        int start = 0;
        int next = 0;
        int steps = 0;

        while (start <= end) {
            next = arr[start];
            start = start + next;
            steps++;
            if (next <= 0) {
                return -1;
            }
        }
        return steps;
    }

    public static void main(String[] args) {

        ArrayInterviewQuestion obj = new ArrayInterviewQuestion();
        int arr[] = { 1, 3, 4, 7, 9, 4, 2, 1, 5, 8, 6 };
        System.out.print(" Number of steps required to reach end of Array: " + obj.getSteps(arr));
    }

}
