package interviewQuestions;

public class sortArrayExample {

    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 4, 21, 1, 9};
        System.out.println("--Array before sort--");
        for (int n : nums) {
            System.out.println(n);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        System.out.println("--Array after sort--");
        for (int n : nums) {
            System.out.println(n);
        }
    }
}