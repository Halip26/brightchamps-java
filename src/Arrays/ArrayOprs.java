package Arrays;

import java.util.Scanner;

public class ArrayOprs {
  private static Scanner scan;

  public static void main(String[] args) {
    scan = new Scanner(System.in);

    int size;
    int choice;

    while (true) {
      System.out.println("\nARRAY OPERATORS\n");
      System.out.println("1. One Dimensional array");
      System.out.println("2. Two Dimensional array");
      System.out.println("3. Record saving array operation");
      System.out.println("4. Exit the program");
      System.out.println("\nEnter the choice of array operation to execute: ");
      choice = scan.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Print One Dimensional Array: ");
          int numbers[] = new int[5];
          // declaraation & instantiation
          numbers[0] = 10;
          numbers[1] = 23;
          numbers[2] = 87;
          numbers[3] = 29;
          numbers[4] = 48;

          // length is the property of array
          for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
          }
          System.out.println();

          break;

        case 2:
          int matrix2D[][] = { { 23, 2, 43 }, { 12, 76, 9 }, { 45, 46, 10 }, { 12, 98, 7 } };

          System.out.println("Print Two Dimensional/Matrix Array: ");
          // printing 2D array or matrix
          for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              System.out.print(matrix2D[i][j] + " ");
            }
            System.out.println();
          }
          break;

        case 3:
          System.out.println("Enter the number of records to save: ");
          size = scan.nextInt();
          String[] names = new String[10];
          int[] ages = new int[10];

          for (int i = 0; i < size; i++) {
            System.out.println("Enter record number: " + (i + 1));
            System.out.println("Enter user name: ");
            names[i] = scan.next();
            System.out.println("Enter user age: ");
            ages[i] = scan.nextInt();

          }
          System.out.println("\n" + "Name" + "\t\t" + "Age");
          System.out.println("_________________________");

          int i = 0;
          while (i < size) {
            System.out.println(names[i] + "\t\t" + ages[i]);
            i++;
          }

          break;

        case 4:
          System.exit(0);

        default:
          System.out.println("Invalid choice!! Please make a valid choice. \n\n");
          break;
      }

    }

  }
}
