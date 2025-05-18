package ExceptionHandling;

import java.util.Scanner;

public class FactorialChecker {
  public static int factorial(int n) {
    if (n < 0) {
      return n;
    }

    int factor = 1;
    int i = 1;

    while (i <= n) {
      factor *= i;
      i++;
    }
    return factor;
  }

  // initialize the scanner
  private static Scanner scanner;

  public static void main(String[] args) {
    scanner = new Scanner(System.in);

    while (true) {
      try {
        System.out.print("\nEnter the number (0 for exit): ");
        int userInput = scanner.nextInt();

        if (userInput == 0) {
          System.out.println("You have exited the factorial checker");
          break;
        } else {
          int result = factorial(userInput);

          // Only create lines
          for (int i = 0; i <= 35; i++) {
            System.out.print("-");
          }
          System.out.println();

          System.out.println("The factorial of " + userInput + " is " + result);
        }
      } catch (Exception e) {
        System.out.println("Error! Please enter a valid number");
        scanner.next(); // Clear invalid input
      }
    }

  }
}
