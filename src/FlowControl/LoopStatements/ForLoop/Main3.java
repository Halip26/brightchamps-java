package FlowControl.LoopStatements.ForLoop;

import java.util.Scanner;

public class Main3 {
  public static void main(String[] args) {
    // Lesson_PatternPrint
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number for rows:");
    int row = scanner.nextInt();

    for (int r = 1; r <= row; r++) {
      for (int c = 1; c <= r; c++) {
        System.out.print(" * ");
      }
      System.out.println();
    }

    scanner.close();

  }
}
