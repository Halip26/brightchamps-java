package Strings;

import java.util.Scanner;

public class PasswordChecker {
  private static Scanner input;

  public static void main(String[] args) {
    int passwordLength = 12, upChars = 0, lowChars = 0;
    int special = 0, digits = 0;
    char ch;

    input = new Scanner(System.in);

    System.out.println("----Rules to create a Passwword----");
    System.out.println("1. The Password must contain at least one upppercase character.");
    System.out.println("2. The Password must contain at least 8 characters long.");
    System.out.println("3. The Password must contain at least one lowecase character.");
    System.out.println("4. The Password must contain at least one digit (0-9).");
    System.out.println("5. The Password must contain at least one special character.");
    System.out.println("6. The Password must not contain '<' or '>'.");

    System.out.print("\nEnter your password: ");
    String userPassword = input.nextLine();

    int total = userPassword.length();

    if (total < passwordLength) {
      System.out.println("\nThe password's Length has to be of 12 characters or more.");
      return;
    } else {
      // only to check strings from userPassword
      for (int i = 0; i < total; i++) {
        ch = userPassword.charAt(i);
        if (Character.isUpperCase(ch))
          upChars++;
        else if (Character.isLowerCase(ch))
          lowChars++;
        else if (Character.isDigit(ch))
          digits++;
        else {
          if (ch == '<' || ch == '>') {
            System.out.println("\nThe Password is Malicious!");
            return;
          } else {
            special++;
          }
        }
      }
    }

    if (upChars != 0 && lowChars != 0 && digits != 0 && special != 0) {
      if (total >= 12) {
        System.out.println("\nThe strength of Password is Strong");
      } else {
        System.out.println("\nThe strength of Password is Medium");
      }

      System.out.println("\n----The Password Contains----");
      System.out.println("UpperCase Character: " + upChars);
      System.out.println("LowerCase Character: " + lowChars);
      System.out.println("Digit: " + digits);
      System.out.println("Special character: " + special);

    } else {
      if (upChars == 0)
        System.out.println("\nThe Password must contain at least one uppercase character.");
      if (lowChars == 0)
        System.out.println("\nThe Password must contain at least one lowercase character.");
      if (digits == 0)
        System.out.println("\nThe Password must contain at least one digit.");
      if (special == 0)
        System.out.println("\nThe Password must contain at least one special character.");
    }

  }
}
