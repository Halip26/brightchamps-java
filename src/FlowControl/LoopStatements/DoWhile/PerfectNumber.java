package FlowControl.LoopStatements.DoWhile;

import java.util.Scanner;

public class PerfectNumber {
  private static Scanner scan;

  public static void main(String[] args) {

    scan = new Scanner(System.in);

    while (true) {
      int i, number, sum = 0;
      System.out.println("\nPlease enter any number: ");
      number = scan.nextInt();
      if (number == 0) {
        System.out.println("You have exited the program!");
        break;
      }
      i = 1;

      // do-while loop
      do {
        if (number % i == 0) {
          sum += i;
        }
        i++; // iteration
      } while (i < number);

      if (sum == number) {
        System.out.println(number + " is a perfect number");

      } else {
        System.out.println(number + " is Not a perfect number");
      }
    }

  }
}
