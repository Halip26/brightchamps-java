package ExceptionHandling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class OtherExceptions {
  private static Scanner scanner;

  public static void main(String[] args) throws Exception {
    scanner = new Scanner(System.in);

    try {
      System.out.println("Enter an Integer: ");
      int number = scanner.nextInt();

      System.err.println("The number entered is " + number);

    } catch (InputMismatchException ex) {
      System.err.println("Incorrect input: an integer is required");
    }
  }

}
