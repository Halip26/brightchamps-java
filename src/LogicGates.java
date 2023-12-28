public class LogicGates {
  // logic gates quiz
  public static void main(String[] args) {

    int a = 81;
    int b = 37;

    // Quiz 1
    System.out.println("Quiz 1: " + ((a == 0) ^ !(a > b))); // false

    // Quiz 2: Using OR (||)
    System.out.println("Quiz 2: " + (a > 50 || b > 30)); // true

    // Quiz 3: Using AND (&&)
    System.out.println("Quiz 3: " + (a > 80 && b < 40)); // true

    // Quiz 4: Using XOR (^)
    System.out.println("Quiz 4: " + (a == 81 ^ b == 37)); // false

    // Quiz 5: Using NOT (!)
    System.out.println("Quiz 5: " + !(a <= 80)); // true

    // Quiz 6: Combining AND, OR, and NOT
    System.out.println("Quiz 6: " + ((a > 80 && b < 40) || !(a == 81))); // true

    // Quiz 7: Combining XOR and AND
    System.out.println("Quiz 7: " + ((a == 81 ^ b == 37) && (a > 50))); // false

    // Quiz 8: Combining OR, AND, and NOT
    System.out.println("Quiz 8: " + ((a > 80 || b < 40) && !(a == 81))); // false

    // Quiz 9: Using NOT and OR
    System.out.println("Quiz 9: " + (!(a > 80) || b != 37)); // false

    // Quiz 10: Using XOR and OR
    System.out.println("Quiz 10: " + ((a == 81 ^ b == 37) || (a < 90))); // true

    // Quiz 11: Using XOR and OR
    System.out.println("Quiz 11: " + ((a <= 81 ^ b >= 37) || (a > 90))); // false
  }
}
