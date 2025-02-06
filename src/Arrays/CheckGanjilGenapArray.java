package Arrays;

public class CheckGanjilGenapArray {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, -4, 5, 6, -7, 8, 9, 10, -12, 21, 4, 13, 15, -16, 17, 18, -19 };

    // menampilkan angka genap dan ganjil
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0 && numbers[i] > 0) {
        System.out.println(numbers[i] + " is even positive");
      }
      if (numbers[i] % 2 == 0 && numbers[i] < 0) {
        System.out.println(numbers[i] + " is even negative");
      }
      if (numbers[i] % 2 != 0 && numbers[i] > 0) {
        System.out.println(numbers[i] + " is odd positive");
      }
      if (numbers[i] % 2 != 0 && numbers[i] < 0) {
        System.out.println(numbers[i] + " is odd negative");
      }
    }
  }
}
