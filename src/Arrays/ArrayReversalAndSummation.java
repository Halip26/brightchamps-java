package Arrays;

import java.util.Scanner;

public class ArrayReversalAndSummation {
  private static Scanner scanner;

  public static void main(String[] args) {
    scanner = new Scanner(System.in);

    int[] a = new int[50];
    int n, sum = 0;

    System.out.print("Enter The Size of Array (Upto 50): ");
    n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.print("Enter Element Number " + i + ": ");
      a[i] = scanner.nextInt();
    }

    System.out.println();

    System.out.println("Elements of Array in Reversed Order is Given Below");

    for (int i = (n - 1); i >= 0; i--) {
      System.out.print(a[i] + "  ");
      sum = sum + a[i];
    }

    System.out.println("\n\nSum Of Array Is = " + sum);
  }
}
