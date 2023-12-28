package FlowControl_IfElse;

import java.util.Scanner;

public class IfElse2 {
  public static void main(String args[]) {

    // 1. program to find out the odd or even number
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number to find out odd or even ");
    int num = scanner.nextInt();

    if (num % 2 == 0) {
      System.out.println("The Number You Have Entered is EVEN!");
    } else {
      System.out.println("The Number You Have Entered is ODD!");
    }

    scanner.close();
  }
}
