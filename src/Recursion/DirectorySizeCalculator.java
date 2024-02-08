package Recursion;

import java.io.File;
import java.util.Scanner;

public class DirectorySizeCalculator {
  private static Scanner scanner;

  public static long calculateDirectorySize(File directory) {
    long size = 0;

    // list all files & subdirections
    File[] files = directory.listFiles();

    if (files != null) {
      for (File file : files) {
        if (file.isFile()) {
          // if file, add its size to total size
          size += file.length();
        } else if (file.isDirectory()) {
          // If directory, recursively calculate its size
          size += calculateDirectorySize(file);
        }
      }
    }
    return size;
  }

  public static void main(String[] args) {
    scanner = new Scanner(System.in);

    // prompt user to input dir path
    System.out.print("Enter the directory path: ");
    String directoryPath = scanner.nextLine();

    // calcualte directory size recursively
    long totalSize = calculateDirectorySize(new File(directoryPath));

    // choose the unit for total size
    System.out.println("-- Choose the unit for the total size --");
    System.out.println("1. Bytes");
    System.out.println("2. Kilobytes (KB)");
    System.out.println("3. Megabytes (MB)");
    System.out.println("4. Gigabytes (GB)");
    System.out.println("5. Terabytes (TB)");
    System.out.print("Enter your choice: ");
    int choice = scanner.nextInt();

    // convert bytes to Kilobytes (1 KB = 1024 bytes)
    long totalSizeKB = totalSize / 1024;
    // convert Kilobytes to Megabytes (1 MB = 1024 kilobytes)
    long totalSizeMB = totalSizeKB / 1024;
    // convert Megabytes to Gigabytes (1 GB = 1024 Megabytes)
    long totalSizeGB = totalSizeMB / 1024;
    // convert Megabytes to Gigabytes (1 TB = 1024 Gigabytes)
    long totalSizeTB = totalSizeGB / 1024;

    if (choice == 1) {
      // Display total size of directory
      System.out.println("Total size of directory: " + totalSize + " bytes");
    } else if (choice == 2) {
      // Display total size of directory
      System.out.println("Total size of directory: " + totalSizeKB + " KB");
    } else if (choice == 3) {
      // Display total size of directory
      System.out.println("Total size of directory: " + totalSizeMB + " MB");
    } else if (choice == 4) {
      // Display total size of directory
      System.out.println("Total size of directory: " + totalSizeGB + " GB");
    } else if (choice == 5) {
      // Display total size of directory
      System.out.println("Total size of directory: " + totalSizeTB + " TB");
    } else {
      System.out.println("Invalid choice");
    }

  }

}
