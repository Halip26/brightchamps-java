package FlowControl.LoopStatements.DoWhile;

import java.util.Scanner;

public class DoWhile2 {
  public static void main(String[] args) {
    // Create Multiplication table using do while
    Scanner scan = new Scanner(System.in);
    int num, count = 1;
    int limit;

    System.out.print("Enter the value to find the multiplication table: ");
    num = scan.nextInt();

    System.out.print("Enter the max limit for multiplication table: ");
    limit = scan.nextInt();

    do {
      System.out.println(count + " x " + num + " = " + (num * count));
      count++;
    } while (count <= limit);

    scan.close();

  }
}
