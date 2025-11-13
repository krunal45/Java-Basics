package main.Experiment.QA.prayogshala;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String operation;
        System.out.println("Enter Operation to perform: 1.Add 2.Sub 3.Div");
        operation = input.nextLine();
        switch (operation) {
            case "Add" -> System.out.println("Addition: " + Addition.getAddedValue(2, 3));
            case "Sub" -> System.out.println("Substraction:" + Substraction.getSubstractedValue(3, 2));
            case "Div" -> System.out.println("Division:" + Division.getDividedValue(4, 2));
            default -> System.out.println("Invalid Operation!");
        }
    }
}
