package Functions;

import java.util.Scanner;

public class CekPalindrome {
  private static Scanner UserInput;

  public static boolean isPalindrome(String word) {
    // Remove spaces and convert letters to lowercase
    String cleanWord = word.toUpperCase().replace(" ", "");

    // Comparing words with their opposites
    return cleanWord.equals(new StringBuilder(cleanWord).reverse().toString());
  }

  public static void main(String[] args) {
    UserInput = new Scanner(System.in);

    // forever looping to output
    while (true) {
      System.out.print("Enter the word ('q' to exit): ");
      String inputWord = UserInput.nextLine();

      if (inputWord.equals("q")) {
        System.out.println("You quit the programme");
        break;
      }

      if (isPalindrome(inputWord)) {
        System.out.println(inputWord + " is a palindrome word.");
      } else {
        System.out.println(inputWord + " is not a palindrome word.");
      }
    }
  }

}
