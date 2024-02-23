package OOP.Abstraction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Kelas abstrak untuk mewakili item dalam perpustakaan
abstract class LibraryItem {
  protected String title;
  protected String author;

  // Konstruktor
  public LibraryItem(String title, String author) {
    this.title = title;
    this.author = author;
  }

  // Metode abstrak untuk menampilkan informasi item
  abstract void displayInfo();
}

// Kelas turunan untuk buku
class Book extends LibraryItem {
  private int pages;

  // Konstruktor
  public Book(String title, String author, int pages) {
    super(title, author);
    this.pages = pages;
  }

  // Implementasi metode untuk menampilkan informasi buku
  void displayInfo() {
    System.out.println("Book Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Number of Pages: " + pages);
  }
}

// Kelas turunan untuk majalah
class Magazine extends LibraryItem {
  private String issue;

  // Konstruktor
  public Magazine(String title, String author, String issue) {
    super(title, author);
    this.issue = issue;
  }

  // Implementasi metode untuk menampilkan informasi majalah
  void displayInfo() {
    System.out.println("Magazine Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Issue: " + issue);
  }
}

// Kelas untuk mengelola perpustakaan
class LibraryManager {
  private List<LibraryItem> items;

  // Konstruktor
  public LibraryManager() {
    items = new ArrayList<>();
  }

  // Metode untuk menambahkan item ke perpustakaan
  public void addItem(LibraryItem item) {
    items.add(item);
  }

  // Metode untuk menampilkan semua item dalam perpustakaan
  public void displayAllItems() {
    System.out.println("Library Inventory:");
    for (LibraryItem item : items) {
      item.displayInfo();
      System.out.println();
    }
  }
}

public class LibraryManagementSystem {
  private static Scanner scanner;

  public static void main(String[] args) {
    scanner = new Scanner(System.in);
    LibraryManager library = new LibraryManager();

    // Menambahkan contoh item ke perpustakaan
    library.addItem(new Book("Java Programming", "John Doe", 300));
    library.addItem(new Magazine("National Geographic", "National Geographic Society", "January 2024"));

    // Menampilkan menu
    System.out.println("Welcome to Library Management System");
    System.out.println("1. Display All Items");
    System.out.println("2. Exit");
    System.out.print("Enter your choice: ");
    int choice = scanner.nextInt();

    // Memproses pilihan pengguna
    switch (choice) {
      case 1:
        library.displayAllItems();
        break;
      case 2:
        System.out.println("Thank you for using Library Management System");
        System.exit(0);
        break;
      default:
        System.out.println("Invalid choice");
    }
  }
}
