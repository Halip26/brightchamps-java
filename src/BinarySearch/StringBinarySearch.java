package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {
  private static Scanner scan;

  public static void main(String args[]) {
    scan = new Scanner(System.in);
    String[] colors = { "violet", "indigo", "blue", "green", "yellow", "orange", "red" };
    // In Binary search,Elements need to be sorted in ascending order
    Arrays.sort(colors);

    // create lines using looping for
    for (int i = 0; i <= 35; i++) {
      System.out.print("-");
    }
    System.out.println();

    System.out.println("Sorted array " + Arrays.toString(colors));
    System.out.println("Enter the color to be searched: ");
    String key = scan.next().toLowerCase();
    int left = 0;
    int right = colors.length - 1;
    int found = 0;
    while (left <= right) {
      int mid = left + (right - left) / 2; // calculate middle value
      if (colors[mid].equals(key)) {

        // create lines using looping for
        for (int i = 0; i <= 35; i++) {
          System.out.print("-");
        }
        System.out.println();

        System.out.println("color " + key + " is found at index " + mid);
        found = 1;
        break;
      } else if (colors[mid].compareTo(key) < 0) // search value is on right side
      {
        left = mid + 1;
      } else {
        right = mid - 1; // search value is on left side
      }
    }
    if (found == 0) {
      System.out.println("your Searched color " + key + " is not found");
    }

  }
}
