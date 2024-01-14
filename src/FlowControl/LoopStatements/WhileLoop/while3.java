package FlowControl.LoopStatements.WhileLoop;

import java.util.Scanner;

public class while3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // variable without initialization value
    int number;
    // variable with initiaization num
    int sum = 0;

    System.out.println("Enter a number:  ");
    number = scan.nextInt();

    while (number >= 0) {
      sum += number;
      System.out.println("Enter a number");
      number = scan.nextInt();
    }

    System.out.println("The sum is  " + sum);

    scan.close();
  }
}
