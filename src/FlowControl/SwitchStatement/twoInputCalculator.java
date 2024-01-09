package FlowControl.SwitchStatement;

import java.util.Scanner;

public class twoInputCalculator {
  // Declaring main method
  public static void main(String[] args) {
    // Decaring all variables
    float firstInput, secondInput, result;
    int choice;
    try (Scanner scanner = new Scanner(System.in)) {
      // creating infinite while loop
      while (true) {
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Substraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Quit\n");

        // Asking user to make choice
        System.out.println("Make your choice: ");
        choice = scanner.nextInt();
        switch (choice) {
          case 5:
            System.out.println("You exited the calculator!");
            System.exit(0);

          default:
            break;
        }

        System.out.println("Enter the first number: ");
        firstInput = scanner.nextFloat();
        System.out.println("Enter the second number: ");
        secondInput = scanner.nextFloat();

        // creating switch case branch
        switch (choice) {
          case 1:
            result = firstInput + secondInput;
            System.out.println("The sum of the number is = " + result + "\n");

            break;
          case 2:
            result = firstInput - secondInput;
            System.out.println("The difference of the number is = " + result + "\n");

            break;
          case 3:
            result = firstInput * secondInput;
            System.out.println("The product of the number is = " + result + "\n");

            break;

          case 4:
            result = firstInput / secondInput;
            System.out.println("The quotient of the number is = " + result + "\n");

            break;

          default:
            System.out.println("Invalid choice!!! Please make valid choice.\n");
            break;
        }
      }
    }

  }

}
