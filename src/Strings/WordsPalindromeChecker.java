package Strings;

import java.util.Scanner;

public class WordsPalindromeChecker {
  public static Scanner scan;

  // Method or function to remove spaces and convert letters to lowercase
  public static String cleanString(String str) {
    StringBuilder result = new StringBuilder();
    for (char ch : str.toCharArray()) {
      if (Character.isAlphabetic(ch)) {
        result.append(Character.toLowerCase(ch));
      }
    }
    return result.toString();
  }

  // Method or Function to check if a word is a palindrome
  public static boolean isPalindrome(String word) {

    String cleanStr = cleanString(word);
    String reversedStr = cleanStr;

    int length = reversedStr.length();

    // looping to compare characters
    for (int i = 0, j = length - 1; i < j; i++, j--) {
      if (reversedStr.charAt(i) != reversedStr.charAt(j)) {
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
