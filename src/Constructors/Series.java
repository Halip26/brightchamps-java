package Constructors;

import java.util.Scanner;

// series 1 : 1! + 2! + . . . n! takes only one input
// series 2: 1!/x + 2!/x^2 + 3!/x^3 . . . n!/x^n. takes two inputs 
// series 3: 1!/x^k + 2!/x^k + 3!/x^k . . . n!/x^k. takes three inputs. 

// This class represents a series calculation based on different formulas
public class Series {
  // Scanner object for user input
  private static Scanner scanner;

  // Instance variables to store input values and series type
  int n, x, k, series_number;

  // Constructor to initialize a Series object for series 1
  Series(int number_of_terms) {
    n = number_of_terms;
    series_number = 1; // Set series number to 1
  }

  // Constructor to initialize a Series object for series 2
  Series(int number_of_terms, int value_of_x) {
    n = number_of_terms;
    x = value_of_x;
    series_number = 2; // Set series number to 2
  }

  // Constructor to initialize a Series object for series 3
  Series(int number_of_terms, int value_of_x, int power) {
    n = number_of_terms;
    x = value_of_x;
    k = power;
    series_number = 3; // Set series number to 3
  }

  // Method to calculate the sum of the series
  double calculate() {
    double sum = 0.0; // Variable to store the sum of the series
    double power_term; // Variable to store the power term
    int fact = 1; // Variable to calculate factorial

    if (series_number == 1) { // Series 1 calculation
      for (int i = 1; i <= n; i++) {
        fact = fact * i; // Calculate factorial
        sum = sum + fact; // Add factorial to sum
      }
    } else if (series_number == 2) { // Series 2 calculation
      for (int i = 1; i <= n; i++) {
        power_term = Math.pow(x, i); // Calculate power term
        fact = fact * i; // Calculate factorial
        sum = sum + (fact / power_term); // Add term to sum
      }
    } else { // Series 3 calculation
      for (int i = 1; i <= n; i++) {
        power_term = Math.pow(x, k); // Calculate power term
        fact = fact * i; // Calculate factorial
        sum = sum + (fact / power_term); // Add term to sum
      }
    }

    return sum; // Return the sum of the series
  }

  public static void main(String args[]) {
    // Create a Scanner object to read input
    scanner = new Scanner(System.in);

    System.out.println("Enter number of terms for the series: ");
    int a = scanner.nextInt(); // Read number of terms
    System.out.println("Enter value of x for the series: ");
    int b = scanner.nextInt(); // Read value of x
    System.out.println("Enter the value of power( k ) for the series: ");
    int c = scanner.nextInt(); // Read value of power

    // Create Series objects for different series types
    Series series_1 = new Series(a);
    Series series_2 = new Series(a, b);
    Series series_3 = new Series(a, b, c);

    // Calculate the sum of each series
    double result1 = series_1.calculate();
    double result2 = series_2.calculate();
    double result3 = series_3.calculate();

    // Print the sum of each series
    System.out.println("Sum of series 1 : " + result1);
    System.out.println("Sum of series 2 : " + result2);
    System.out.println("Sum of series 3 : " + result3);
  }
}
