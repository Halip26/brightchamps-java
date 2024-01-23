package Arrays;

public class ArrayNumbersWords {
  public static void main(String[] args) {
    int[] numbers = { 23, 45, 65, 45, 34 };
    String[] words = { "halo", "kamu", "lagi", "apa", "kabar" };

    System.out.println("The numbers are:");
    for (int n : numbers) {
      System.out.print(n + "  ");
    }
    System.out.println();

    System.out.println("The words are:");
    for (String word : words) {
      System.out.print(word + "  ");
    }
    System.out.println();
  }
}
