package BubbleSort;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class AscendingOrder {
  public static void main(String[] args) {
    int[] array = { 18, 32, -11, 6, 68, 2, -34 };
    System.out.println("Ascending Sorted Array: " + Arrays.toString(ascendingBubbleSort(array)) + "\n");
  }

  public static int[] ascendingBubbleSort(int[] array) {
    Instant start = Instant.now();

    // Bubble Sort Implementation in Ascending Order
    for (int indexTobeSorted = array.length - 1; indexTobeSorted > 0; indexTobeSorted--) {
      for (int index = 0; index < indexTobeSorted; index++) {
        if (array[index] > array[index + 1]) {
          swap(array, index, index + 1);
        }
      }
    }

    Instant end = Instant.now();
    System.out.println("Elapsed time of ascendingBubbleSort: " + Duration.between(start, end).toNanos());
    return array;
  }

  public static void swap(int[] array, int firstIndex, int secondIndex) {
    if (firstIndex != secondIndex) {
      int temp = array[firstIndex];
      array[firstIndex] = array[secondIndex];
      array[secondIndex] = temp;
    }
  }
}
