package interviewQuestions;

@java.lang.FunctionalInterface
interface A2 {
    int sum(int n1, int n2);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        A2 obj = Integer::sum;
        int res = obj.sum(2, 3);
        System.out.println("Sum : " + res);
    }
}
