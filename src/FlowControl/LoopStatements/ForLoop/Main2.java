package FlowControl.LoopStatements.ForLoop;

import java.util.Scanner;

public class Main2 {
  public static void main(String[] args) {
    // Lesson factorial
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number for computing factorial: ");
    int number = scanner.nextInt();

    if (number < 0) {
      System.out.println("Factorial is not define for negative number");
    } else {
      int product = 1;
      for (int i = 1; i <= number; i++) {
        product *= i;
      }

      System.out.println("Factorial of the number " + number + " is " + product);
    }

    scanner.close();
  }

}
