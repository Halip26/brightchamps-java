package FlowControl.LoopStatements.ForLoop;

import java.util.Scanner;

public class Main2 {
  public static void main(String[] args) {
    // Lesson_Factorial
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number for computing factorial:");
    int n = scanner.nextInt();
    int product = 1;

    for (int i = 1; i <= n; i++) {
      product = product * i;
    }

    System.out.println("Factorial of the number " + n + " is " + product);

    scanner.close();
  }
}
