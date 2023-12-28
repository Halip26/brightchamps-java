package FlowControl_IfElse;

import java.util.Scanner;

public class IfElse3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int number = scanner.nextInt();

    if (number > 0) {
      System.out.println("You entered a positive integer: " + number);
    } else if (number < 0) {
      System.out.println("You entered a negative integer: " + number);
    } else {
      System.out.println("You entered 0.");
    }

    scanner.close();
  }
}
