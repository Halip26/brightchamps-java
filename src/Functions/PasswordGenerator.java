package Functions;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
  /*
   * A functions in programming languange specially in Java is mini-program within
   * a larger program.
   */
  private static Scanner scanner;

  private static final String LOWER_CASE = "abcdefghijklmonpqrstuvwxyz";
  private static final String UPPER_CASE = "ABCDEFGHIJKLMONPQRSTUVWXYZ";
  private static final String DIGITS = "0123456789";
  private static final String SPECIAL_CHARACTERS = "!@#$%^&*()_+-=[]{};':\\\"\\\\|,.<>/?";

  public static String generatePassword(int length, boolean lowerCase, boolean upperCase, boolean digits,
      boolean specialCharacters) {
    StringBuilder password = new StringBuilder();
    Random random = new Random();

    String possibleCharacters = "";
    if (lowerCase) {
      possibleCharacters += LOWER_CASE;
    }
    if (upperCase) {
      possibleCharacters += UPPER_CASE;
    }
    if (digits) {
      possibleCharacters += DIGITS;
    }
    if (specialCharacters) {
      possibleCharacters += SPECIAL_CHARACTERS;
    }

    for (int i = 0; i < length; i++) {
      int randomIndex = random.nextInt(possibleCharacters.length());
      password.append(possibleCharacters.charAt(randomIndex));
    }

    return password.toString();
  }

  public static void main(String[] args) {
    scanner = new Scanner(System.in);

    System.out.println("Enter the length of the password: ");
    // Its purpose is to convert a string representation of a numerical value (like
    // "123") into its corresponding integer value (like 123).
    int length = Integer.parseInt(scanner.nextLine());
    System.out.println("Use lower case? (y/n): ");
    boolean lowerCase = scanner.nextLine().equalsIgnoreCase("y");
    System.out.println("Use upper case? (y/n): ");
    boolean upperCase = scanner.nextLine().equalsIgnoreCase("y");
    System.out.println("Use lower case? (y/n): ");
    boolean digits = scanner.nextLine().equalsIgnoreCase("y");
    System.out.println("Use lower case? (y/n): ");
    boolean specialCharacters = scanner.nextLine().equalsIgnoreCase("y");

    String password = generatePassword(length, lowerCase, upperCase, digits, specialCharacters);

    System.out.println("Your password generated to: " + password);
  }
}
