package FlowControl.IfElse;

import java.util.Scanner;

public class Main1 {
  public static void main(String args[]) {
    // this project is to find out the largest number using if-else
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter five number: ");
    int a = scanner.nextInt();
    System.out.println("Enter second number: ");
    int b = scanner.nextInt();
    System.out.println("Enter third number: ");
    int c = scanner.nextInt();

    if ((a > b) && (a > c)) {
      System.out.println("The greatest Number is " + a);
    } else if ((b > a) && (b > c)) {
      System.out.println("The greatest Number is " + b);
    } else {
      System.out.println("The greatest Number is " + c);
    }

    scanner.close();
  }

}