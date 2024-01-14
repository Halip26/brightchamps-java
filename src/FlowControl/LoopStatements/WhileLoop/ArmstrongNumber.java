package FlowControl.LoopStatements.WhileLoop;

import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
    /*
     * An Armstrong number is a number that is the sum of its own digits each raised
     * to the power of the number of digits. For example, 153 is an Armstrong number
     * because: 1^3 + 5^3 + 3^3 = 153
     */
    try (
        Scanner scan = new Scanner(System.in)) {
      while (true) {
        System.out.println("Enter a number to check if it's an Armstrong number: ");
        int number = scan.nextInt();

        // Check id the entered number is an Armstrong number
        if (number == 0) {
          System.out.println("You exited this program!");
          break;
        } else if (isArmstrongNumber(number)) {
          System.out.println(number + " is an Armstrong number.");
        } else {
          System.out.println(number + " is not an Armstrong number.");
        }
      }
    }

  }

  // function to check armstrong number
  private static boolean isArmstrongNumber(int num) {
    int originalNumber, remainder, result = 0, n = 0;

    // Assign the second enetered number to a variable
    originalNumber = num;

    // count the number of the digits in the number
    for (; originalNumber != 0; originalNumber /= 10, ++n)
      ;
    // Assign the entered number to variable again
    originalNumber = num;

    // calculate the result
    while (originalNumber != 0) {
      remainder = originalNumber % 10;
      result += Math.pow(remainder, n);
      originalNumber /= 10;

    }

    return result == num;
  }
}
