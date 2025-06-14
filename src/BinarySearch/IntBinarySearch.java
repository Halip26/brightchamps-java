package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class IntBinarySearch {
  private static Scanner scan;

  public static void main(String args[]) {
    scan = new Scanner(System.in);
    // Predefined array
    int[] arr = { 34, 7, 23, 32, 5, 62, 3, 45, 12, 90, 87, 75, 34, 31, 11, 15 };
    int len = arr.length;

    // In Binary search, Elements need to be sorted in ascending order
    Arrays.sort(arr);

    // create lines using looping for
    for (int i = 0; i <= 35; i++) {
      System.out.print("-");
    }
    System.out.println();

    System.out.println("Sorted array " + Arrays.toString(arr));

    // Predefined key to search
    System.err.println("Enter the number to search: ");
    int key = scan.nextInt();
    System.out.println("\nNumber to be searched: " + key);

    int left = 0;
    int right = len - 1;
    boolean found = false;
    while (left <= right) {
      int mid = left + (right - left) / 2; // calculate middle value
      if (arr[mid] == key) {

        // create lines using looping for
        for (int i = 0; i <= 35; i++) {
          System.out.print("-");
        }
        System.out.println();

        System.out.println("Number is found at index : " + mid);
        found = true;
        break;
      } else if (arr[mid] < key) // number to be searched is on right side
      {
        left = mid + 1;
      } else {
        right = mid - 1; // number to be searched is on left side
      }
    }
    if (!found) {
      System.out.println("Your searched number " + key + " is not found");
    }
  }
}