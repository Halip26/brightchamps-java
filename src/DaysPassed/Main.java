package DaysPassed;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
  private static Scanner scanner;

  public static void main(String[] args) {
    scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    Date birthDate = getBirthDate();

    int daysPassed = calculateDays(birthDate);

    System.out.println("-----------------------------------");
    System.out.printf("Kamu telah hidup selama %d days, %s%n", daysPassed, name);

  }

  private static Date getBirthDate() {
    scanner = new Scanner(System.in);

    System.out.print("Enter the day of your birth: ");
    int day = scanner.nextInt();
    System.out.print("Enter the month of your birth: ");
    int month = scanner.nextInt();
    System.out.print("Enter the year of your birth: ");
    int year = scanner.nextInt();

    String dateString = String.format("%d-%d-%d", year, month, day);
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    try {
      return dateFormat.parse(dateString);
    } catch (ParseException e) {
      e.printStackTrace();
      return null;
    }

  }

  private static int calculateDays(Date birthDate) {
    long millisecondsInADay = 24 * 60 * 60 * 1000;

    Date today = new Date();

    long daysPassed = (today.getTime() - birthDate.getTime()) / millisecondsInADay;

    return (int) daysPassed;

  }
}
