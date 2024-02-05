package Recursion;

import java.util.Scanner;

public class RecursionFunctions {
  private static Scanner scanner;

  // function to count factorial
  public static int factorial(int n) {
    if (n <= 1) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

  // function sequnce calculation of fibanocci
  public static int fibanocci(int n) {
    if (n <= 1) {
      return 1;
    } else {
      return fibanocci(n - 1) + fibanocci(n - 2);
    }
  }

  // function counts the number of digits
  public static int sumDigits(int n) {
    if (n == 0) {
      return 0;
    } else {
      return n % 10 + sumDigits(n / 10);
    }
  }

  public static void main(String[] args) {
    // this project is about fibanocci sequence
    scanner = new Scanner(System.in);

    // Input for factorial
    System.out.print("Enter a number to find factorial: ");
    int factorialInput = scanner.nextInt();
    int factorialResult = factorial(factorialInput);
    System.out.println("Factorial of " + factorialInput + " is " + factorialResult);

    // Input for Fibanocci sequence
    System.out.print("Enter the number of terms for fibonacci series: ");
    int fibanoccilInput = scanner.nextInt();
    int fibanocciResult = fibanocci(fibanoccilInput);
    System.out.println("Sum of Fibanocci series up to " + fibanoccilInput + " is " + fibanocciResult);

    // Input for the number digits
    System.out.print("Enter the number of terms for fibonacci series: ");
    int sumDigitsInput = scanner.nextInt();
    int sumDigitsResult = sumDigits(sumDigitsInput);
    System.out.println("Sum of digits of " + sumDigitsInput + " is " + sumDigitsResult);
  }
}
