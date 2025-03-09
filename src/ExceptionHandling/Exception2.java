package ExceptionHandling;

import java.util.Scanner;

public class Exception2 {
  private static Scanner scan;

  public static void main(String args[]) {
    scan = new Scanner(System.in);

    try { // monitor a block of code.
      System.err.println("Enter first number: ");
      int x = scan.nextInt();
      System.err.println("Enter the second number: ");
      int y = scan.nextInt();
      System.out.println("Result of x/y = " + (x / y));
    } catch (ArithmeticException e) {

      // catch divide-by-zero error
      System.out.println("Error, not allowed");
    }

    System.out.println("After catch statement.");
  }
}
