package main.interviewQuestions;

enum Statuses {
    OK, PENDING, PASS, FAIL;
}

public class EnumsExample {
    public static void main(String[] args) {
        System.out.println(Statuses.OK);
        Statuses statuses = Statuses.PASS;
        System.out.println(statuses.ordinal());

        for (Statuses statuses1 : Statuses.values()) {
            System.out.println("status : " + statuses1 + " Index : " + statuses1.ordinal());
        }
    }
}
