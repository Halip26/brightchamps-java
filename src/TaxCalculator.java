import java.util.Scanner;

public class TaxCalculator {

  private static Scanner scanner;

  public static void main(String[] args) {
    scanner = new Scanner(System.in);
    System.out.println("Enter your salary: ");
    double salary = scanner.nextDouble();
    double tax = calculateTax(salary);
    System.out.println("Your tax is: " + tax);
  }

  public static double calculateTax(double salary) {
    double tax = salary * 0.025;
    return tax;
  }
}