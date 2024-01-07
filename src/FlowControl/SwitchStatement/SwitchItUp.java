package FlowControl.SwitchStatement;

//Importing Scanner class
import java.util.Scanner;

//Creating Class
public class SwitchItUp {

  // Creating main method
  public static void main(String[] args) {

    // Declaring all variables
    float first_operand, second_operand, result;
    int choice;
    Scanner scanner = new Scanner(System.in);
    // Creating infinite while loop

    // Creating menu
    System.out.println("Press 1 for Addition");
    System.out.println("Press 2 for Subtraction");
    System.out.println("Press 3 for Multiplication");
    System.out.println("Press 4 for Division");
    System.out.println("Press 5 to Quit\n \n ");

    // Asking user to make choice
    System.out.println("Make your choice");
    choice = scanner.nextInt();

    // Creating switch case branch
    switch (choice) {

      // First case for finding the addition
      case 1:
        System.out.println("Enter the first number: ");
        first_operand = scanner.nextFloat();
        System.out.println("Enter the second number: ");
        second_operand = scanner.nextFloat();
        result = first_operand + second_operand;
        System.out.println("The sum of the numbers is = " + result + "\n");
        break;

      // Second case for finding the difference
      case 2:
        System.out.println("Enter the first number: ");
        first_operand = scanner.nextFloat();
        System.out.println("Enter the second number: ");
        second_operand = scanner.nextFloat();
        result = first_operand - second_operand;
        System.out.println("The difference of the numbers is = " + result + "\n");
        break;

      // Third case for finding the product
      case 3:
        System.out.println("Enter the first number: ");
        first_operand = scanner.nextFloat();
        System.out.println("Enter the second number: ");
        second_operand = scanner.nextFloat();
        result = first_operand * second_operand;
        System.out.println("The product of the numbers is = " + result + "\n");
        break;

      // Fourth case for finding the quotient
      case 4:
        System.out.println("Enter the first number: ");
        first_operand = scanner.nextFloat();
        System.out.println("Enter the second number: ");
        second_operand = scanner.nextFloat();
        result = first_operand / second_operand;
        System.out.println("The quotient is = " + result + "\n");
        break;

      // Fifth case to quit the program
      case 5:
        System.exit(0);

        // default case to display the message invalid choice made by the user
      default:
        System.out.println("Invalid choice!!! Please make first_operand valid choice. \\n\\n");
    }

    scanner.close();
  }
}
