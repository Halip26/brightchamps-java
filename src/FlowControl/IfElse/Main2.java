package FlowControl.IfElse;

import java.util.Scanner;

public class Main2 {
  public static void main(String[] args) {
    // this program to find out the odd or even number
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Enter number (find out odd or even): ");
      int num = scanner.nextInt();

      if (num == 0) {
        System.out.println("You exited the program");
        break;
      }

      if (num % 2 == 0) {
        System.out.println("The number you've entered is EVEN!");

      } else {
        System.out.println("The number you've entered is ODD!");
      }
    }

    scanner.close();

  }
}
