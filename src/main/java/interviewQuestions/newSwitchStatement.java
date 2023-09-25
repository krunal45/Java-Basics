package interviewQuestions;

import java.util.Scanner;

public class newSwitchStatement {
    Scanner scanner = new Scanner(System.in);

    public String getInput() {
        System.out.println("Enter day :");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        newSwitchStatement obj = new newSwitchStatement();
        String day = obj.getInput();
        String val = switch (day) {
            case "Monday" -> "6 AM";
            case "Sunday" -> "7 AM";
            default -> "8 AM";
        };
        System.out.println(" I woke up at :" + val + " since it is :" + day);
    }
}
