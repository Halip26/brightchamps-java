package Strings;

import java.util.Scanner;

public class WordsPalindromeChecker {
  public static Scanner scan;

  // Method or Function to check if a word is a palindrome
  public static boolean isPalindrome(String word) {
    String moreWords = word.replaceAll("\\s+", "").toLowerCase();

    int length = moreWords.length();

    // looping to compare characters
    for (int i = 0, j = length - 1; i < j; i++, j--) {
      if (moreWords.charAt(i) != moreWords.charAt(j)) {
        return false; // not a palindrome
      }
    }

    return true; // it's a palindrome
  }

  public static void main(String[] args) {
    scan = new Scanner(System.in);
    String kata;

    while (true) {
      System.out.print("\nEnter your words (q for exit): ");
      kata = scan.nextLine();

      if (kata.equals("q")) {
        System.out.println("You have exited the program");
        break;
      } else if (isPalindrome(kata)) {
        System.out.println(kata + " is a palindrome word");
      } else {
        System.out.println(kata + " isn't a palindrome word");
      }
    }
  }
}
