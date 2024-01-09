package FlowControl.IfElse;

import java.util.Scanner;

public class CoronaChecking {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // bss is block started by symbol
    boolean fever, lossOfTaste, lossOfSmell, cough, tiredness, tickets, luggage, isPositive;
    String name;
    float age;

    System.out.print("Enter your name: ");
    name = scanner.next();

    System.out.print("Enter your age: ");
    age = scanner.nextFloat();

    if (age >= 17) {
      System.out.println("You're underage you cannot take a board");
    }

    System.out.println("\nWelcome " + name + ", to Corona Checking Centre,");
    System.out.println("It is mandatory to get checked for corona symptoms before you board the flight!");
    System.out.println("Enter the following details with full honesty to generate your report");
    System.out.println("Instructions for users: Enter (0) for NO and (1) for YES");
    System.out.println("---------------------------------------------------");

    System.out.print("\n1. Have you been feeling feverish since past few days? (0 for No, 1 for Yes): ");
    fever = scanner.nextBoolean();
    System.out.print("\n2. Have you been feeling loss of taste since past few days? (0 for No, 1 for Yes): ");
    lossOfTaste = scanner.nextBoolean();
    System.out.print("\n3. Have you been feeling loss of smell since past few days? (0 for No, 1 for Yes): ");
    lossOfSmell = scanner.nextBoolean();
    System.out.print("\n4. Are you having cough problem since past few days? (0 for No, 1 for Yes): ");
    cough = scanner.nextBoolean();
    System.out.print("\n5. Have you been tired since past few days? (0 for No, 1 for Yes): ");
    tiredness = scanner.nextBoolean();

    isPositive = fever && (lossOfTaste || lossOfSmell) && cough && tiredness;

    if (isPositive) {
      System.out.println("\n" + name + ", you seem to be corona positive based on your symptoms.");
      System.out.println("We cannot board you on the flight. Sorry for the inconvenience!");
    } else {
      System.out
          .print("\nAre you diagnosed with COVID-19? (0 for No, 1 for Yes): " + (isPositive ? "Yes" : "No") + "\n\n");

      System.out.println("Answer with No (0) or Yes (1)");
      System.out.print("Do you have valid tickets? (0 for No, 1 for Yes): ");
      tickets = scanner.nextBoolean();

      System.out.print("Do you want your luggage checked in? (0 for No, 1 for Yes): ");
      luggage = scanner.nextBoolean();

      boolean canBoard = tickets && luggage || !isPositive;

      if (!canBoard) {
        System.out.println("\nBoarding process incomplete!");
      } else {
        System.out.println("\nBoarding process completed successfully. Have a safe trip! " + name);
      }
    }

    scanner.close();
  }
}
