package FlowControl.IfElse;

import java.util.Scanner;

public class CheckOddEvenPositiveNegative {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Check positive/negative even & positive/negative odd integer");
    System.out.println("----------------------------------------");

    while (true) {
      System.out.print("Enter an integer: ");
      int number = scanner.nextInt();

      if (number > 0 && number % 2 == 0) {
        System.out.println("The number " + number + " is even positive");
      } else if (number > 0 && number % 2 != 0) {
        System.out.println("The number " + number + " is odd positive");
      } else if (number < 0 && number % 2 == 0) {
        System.out.println("The number " + number + " is even negative");
      } else if (number < 0 && number % 2 != 0) {
        System.out.println("The number " + number + " is odd negative");
      } else {
        System.out.println("Program is stopped, you entered 0!");
        break;
      }
    }

    scanner.close();
  }
}
