package ExceptionHandling;

import java.util.*;

// user defined exception
class OutofStockException extends Exception {
  // member variable to store our custom message
  String msg;

  OutofStockException(String msg) {
    // passing the parameter to the super class constructor
    super(msg);
  }
}

// Main class
public class Chocolate {
  private static Scanner scanner;

  public static void main(String[] args) {
    // initial chocolate stocks
    int whitechocolate_quantity = 20;
    int darkchocolate_quantity = 30;

    // customer purchases the chocolate
    scanner = new Scanner(System.in);
    System.out.println("Enter quantity to purchase white Chocolates");
    int whitechocolate_purchase = scanner.nextInt();

    System.out.println("Enter quantity to purchase Dark Chocolates");
    int darkchocolate_purchase = scanner.nextInt();

    // try ...catch block to handle the exception
    try {
      if (whitechocolate_quantity < whitechocolate_purchase && darkchocolate_quantity < darkchocolate_purchase) {
        throw new OutofStockException("White & Dark Chocolate Out of Stock");
      }

      if (whitechocolate_quantity < whitechocolate_purchase) {
        throw new OutofStockException("White Chocolate Out of Stock");
      }

      if (darkchocolate_quantity < darkchocolate_purchase) {
        throw new OutofStockException("Dark Chocolate Out of Stock");
      }

    }
    // catch block
    catch (OutofStockException ex) {
      // prints message passed to the super constructor
      System.err.println(ex.getMessage());
    }

    // finally block
    finally {

      System.out.println("---------------------------");
      System.out.println("Initial Stock");
      System.out.println("---------------------------");
      System.out
          .println("White Chocolates : " + whitechocolate_quantity + "   Dark Chocolates : " + darkchocolate_quantity);

      System.out.println("---------------------------");
      System.out.println("Customer Wanted to Buy");
      System.out.println("---------------------------");
      System.out
          .println("White Chocolates : " + whitechocolate_purchase + "   Dark Chocolates : " + darkchocolate_purchase);

      // calculate the remaining stock of white chocolate
      if (whitechocolate_quantity >= whitechocolate_purchase)
        whitechocolate_quantity -= whitechocolate_purchase;

      // calculate the remaining stock of dark chocolate
      if (darkchocolate_quantity >= darkchocolate_purchase)
        darkchocolate_quantity -= darkchocolate_purchase;

      System.out.println("---------------------------");
      System.out.println("Current Stock Details");
      System.out.println("---------------------------");
      System.out
          .println("White Chocolates : " + whitechocolate_quantity + "   Dark Chocolates : " + darkchocolate_quantity);

    }
  }
}
