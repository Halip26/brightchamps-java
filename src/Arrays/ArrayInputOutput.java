package Arrays;

import java.util.Scanner;

public class ArrayInputOutput {
  private static Scanner scan;

  public static void main(String[] args) {
    scan = new Scanner(System.in);

    int[] numbers = new int[5];
    String[] words = new String[5];

    System.out.println("Enter 5 numbers: ");

    // store input from user to array
    for (int i = 0; i < 5; i++) {
      numbers[i] = scan.nextInt();
    }

    System.out.println("The numbers are: ");

    // to print out array elements
    for (int n = 0; n < 5; n++) {
      System.out.print(numbers[n] + " ");
    }

    System.out.println();

    System.out.println("Enter 5 words: ");

    // store input from user to array
    for (int w = 0; w < 5; w++) {
      words[w] = scan.next();
    }

    System.out.println("The words are: ");

    // to print out array elements
    for (int n = 0; n < 5; n++) {
      System.out.print(words[n] + " ");
    }

    System.out.println();

  }

}
