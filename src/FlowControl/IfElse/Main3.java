package FlowControl.IfElse;

import java.util.Scanner;

public class Main3 {
  public static void main(String[] args) {
    // this program to check out negative & positive integer
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter an integer: ");
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
