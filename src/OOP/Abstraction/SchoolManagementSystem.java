package OOP.Abstraction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Kelas abstrak untuk mewakili anggota sekolah
abstract class SchoolMember {
  // protected is access modifier
  protected String name;

  // Konstruktor
  public SchoolMember(String name) {
    this.name = name;
  }

  // Metode abstrak untuk menampilkan informasi anggota sekolah
  abstract void displayInfo();
}

// Kelas turunan untuk siswa
class Student extends SchoolMember {
  private int grade;

  // Konstruktor
  public Student(String name, int grade) {
    super(name);
    this.grade = grade;
  }

  // Implementasi metode untuk menampilkan informasi siswa
  void displayInfo() {
    System.out.println("Student Name: " + name);
    System.out.println("Grade: " + grade);
  }
}

// Kelas turunan untuk guru
class Teacher extends SchoolMember {
  private String subject;

  // Konstruktor
  public Teacher(String name, String subject) {
    super(name);
    this.subject = subject;
  }

  // Implementasi metode untuk menampilkan informasi guru
  void displayInfo() {
    System.out.println("Teacher Name: " + name);
    System.out.println("Subject: " + subject);
  }
}

// Kelas untuk mengelola sekolah
class SchoolManager {
  private List<SchoolMember> members;

  // Konstruktor
  public SchoolManager() {
    members = new ArrayList<>();
  }

  // Metode untuk menambahkan anggota sekolah
  public void addMember(SchoolMember member) {
    members.add(member);
  }

  // Metode untuk menampilkan semua anggota sekolah
  public void displayAllMembers() {
    System.out.println("School Members:");
    for (SchoolMember member : members) {
      member.displayInfo();
      System.out.println();
    }
  }
}

public class SchoolManagementSystem {
  private static Scanner scanner;

  public static void main(String[] args) {
    scanner = new Scanner(System.in);
    SchoolManager school = new SchoolManager();

    // Menambahkan contoh anggota sekolah
    school.addMember(new Student("John", 10));
    school.addMember(new Student("Halip", 12));
    school.addMember(new Teacher("Jane", "Mathematics"));

    // Menampilkan menu
    System.out.println("Welcome to School Management System");
    System.out.println("1. Display All Members");
    System.out.println("2. Exit");
    System.out.print("Enter your choice: ");
    int choice = scanner.nextInt();

    // Memproses pilihan pengguna
    switch (choice) {
      case 1:
        school.displayAllMembers();
        break;
      case 2:
        System.out.println("Thank you for using School Management System");
        System.exit(0);
        break;
      default:
        System.out.println("Invalid choice");
    }

  }
}
