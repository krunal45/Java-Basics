package interviewQuestions;

enum Status {
    SUCCESS, FAILED, PENDING
}

public class switchCaseUsingEnum {
    public static void main(String[] args) {

        Status s = Status.FAILED;

//        if (s == Status.SUCCESS) {
//            System.out.println("Done");
//        } else if (s == Status.PENDING) {
//            System.out.println("In progress");
//        } else if (s == Status.FAILED) {
//            System.out.println("Try again");
//        }

        String res = switch (s) {
            case SUCCESS -> "Done";
            case PENDING -> "In progress";
            default -> "Try again";
        };
        System.out.println(res);
    }
}
