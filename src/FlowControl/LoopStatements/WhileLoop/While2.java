package FlowControl.LoopStatements.WhileLoop;

import java.util.Scanner;

public class While2 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number to print table: ");
    int num = scanner.nextInt();
    int i = 1;

    while (i <= 10) {
      System.out.println(i + " x " + num + " = " + (num * i));
      i++;
    }

    scanner.close();

  }

}
