package Recursion;

import java.util.Scanner;

public class Calculator {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n-- Welcome to calculator --");
            // Create lines
            for (int i = 0; i < 40; i++) {
                System.out.print("-");
            }
            System.out.println();
            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 to quit");
            // Create lines
            for (int i = 0; i < 40; i++) {
                System.out.print("-");
            }
            System.out.println();
            System.out.print("Enter your choice: ");
            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    performOperation(a, b, "addition");
                    break;
                case 2:
                    performOperation(a, b, "subtraction");
                    break;
                case 3:
                    performOperation(a, b, "multiplication");
                    break;
                case 4:
                    performOperation(a, b, "division");
                    break;
                case 5:
                    System.out.println("You have exited the calculator, Bye!");
                    return;
                default:
                    System.out.println("Invalid input, try again!");
            }
        }
    }

    public static void performOperation(int a, int b, String operation) {
        int result = 0;
        MethodCalculatorRecursion reference = new MethodCalculatorRecursion();

        switch (operation) {
            case "addition":
                result = reference.addition(a, b);
                System.out.println("Sum of " + a + " + " + b + " = " + result);
                break;
            case "subtraction":
                result = reference.subtraction(a, b);
                System.out.println("Subtraction of " + a + " - " + b + " = " + result);
                break;
            case "multiplication":
                result = reference.multiplication(a, b);
                System.out.println("Multiplication of " + a + " * " + b + " = " + result);
                break;
            case "division":
                result = reference.division(a, b);
                System.out.println("Division of " + a + " / " + b + " = " + result);
                break;
        }
    }

}
