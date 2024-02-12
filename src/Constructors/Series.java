package Constructors;

import java.util.Scanner;

// series 1 : 1! + 2! + . . . n! takes only one input
// series 2: 1!/x + 2!/x^2 + 3!/x^3 . . . n!/x^n. takes two inputs 
// series 3: 1!/x^k + 2!/x^k + 3!/x^k . . . n!/x^k. takes three inputs. 

// This class represents a series calculation based on different formulas
public class Series {
  // Scanner object for user input
  private static Scanner scanner;

  // Instance variables to state input & series type
  int n, x, k, series_number;

  // Constructor to initialize a series object for series
  Series(int number_of_terms) {
    n = number_of_terms;
    series_number = 1; // set series number to 1
  }

  // Constructor to initilize a series object for series 2
  Series(int number_of_terms, int value_of_x) {
    n = number_of_terms;
    x = value_of_x;
    series_number = 2; // set series number to 1
  }

  // Constructor to initilize a series object for series 3
  Series(int number_of_terms, int value_of_x, int power) {
    n = number_of_terms;
    x = value_of_x;
    k = power;
    series_number = 3; // set series number to 3
  }

  // Method to calculate the sum of the series
  double calculate() {
    double sum = 0.0; // variable to store the sum of the series
    double power_term; // variable to store the power term
    double fact = 1; // variable to calculate factorial

    if (series_number == 1) { // series 1 calclation
      for (int i = 1; i <= n; i++) {
        fact *= i; // Calculate factorial
        sum += fact; // Add factorial to sum
      }
    } else if (series_number == 2) { // series 2 calclation
      for (int i = 1; i <= n; i++) {
        power_term = Math.pow(x, i); // is a mathematical calculation
        fact *= i; // Calculate factorial
        sum += (fact / power_term); // Add factorial to sum
      }
    } else { // series 3 calculation
      for (int i = 1; i <= n; i++) {
        power_term = Math.pow(x, k); // calculate power term
        fact *= i; // Calculate factorial
        sum += (fact / power_term); // Add factorial to sum
      }
    }

    return sum; // Return the sum of the series
  }

  public static void main(String[] args) {
    // Create a scnnaer object to read inputs
    scanner = new Scanner(System.in);

    System.out.println("Enter number of terms for the series: ");
    int a = scanner.nextInt(); // read value of term
    System.out.println("Enter value of x for the series: ");
    int b = scanner.nextInt(); // read value of x
    System.out.println("Enter value of k for the series: ");
    int c = scanner.nextInt(); // read value of power

    // Create series objects for different series types
    Series series_1 = new Series(a);
    Series series_2 = new Series(a, b);
    Series series_3 = new Series(a, b, c);

    // Calculate the sum of the each series
    double result1 = series_1.calculate();
    double result2 = series_2.calculate();
    double result3 = series_3.calculate();

    // Print the sum of each series
    System.out.println("Sum of series 1 : " + result1);
    System.out.println("Sum of series 2 : " + result2);
    System.out.println("Sum of series 3 : " + result3);
  }

}
