package FlowControl_IfElse;

import java.util.Scanner;

public class IfElse1 {
  public static void main(String args[]) {

    // 1. program to find out the largest number to implement if-else
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number ");
    int a = scanner.nextInt();

    System.out.println("Enter Second number ");
    int b = scanner.nextInt();

    System.out.println("Enter Third number ");
    int c = scanner.nextInt();

    if ((a > b) && (a > c)) {
      System.out.println("The greatest Number is " + a);
    }

    else if ((b > a) && (b > c)) {
      System.out.println("The greatest Number is " + b);
    }

    else {
      System.out.println("The greatest Number is " + c);
    }

    scanner.close();

  }
}
