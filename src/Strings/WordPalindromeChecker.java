package Strings;

import java.util.Scanner;

public class WordPalindromeChecker {
  public static Scanner scan;

  // Function to check if a word is a palindrome
  public static boolean isPalindrome(String word) {

    int length = word.length();

    // looping to compare characters
    for (int i = 0, j = length - 1; i < j; i++, j--) {
      if (word.charAt(i) != word.charAt(j)) {
        return false; // not a palindrome
      }
    }

    return true; // it's a palindrome
  }

  public static void main(String[] args) {
    scan = new Scanner(System.in);
    String kata;

    while (true) {
      System.out.print("\nEnter your word (q for exit): ");
      kata = scan.nextLine();

      System.out.println("-----------------------------");

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
