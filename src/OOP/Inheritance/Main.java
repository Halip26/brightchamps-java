package OOP.Inheritance;

import java.util.Scanner;

class EmployOffice {
  int empNo;
  String empName;
  int salary;
  String designation;

  // Konstruktor
  public EmployOffice(int empNo, String empName, int salary, String designation) {
    this.empNo = empNo;
    this.empName = empName;
    this.salary = salary;
    this.designation = designation;
  }

  // Metode untuk menampilkan data
  void displayData() {
    System.out.println("Employ name => " + empName + "\t\tEmploy number => " + empNo);
    System.out.println("Salary => " + salary + "\t\tDesignation => " + designation);
  }
}

class Teaching extends EmployOffice {
  // Konstruktor
  public Teaching(int empNo, String empName, int salary, String designation) {
    super(empNo, empName, salary, designation);
  }
}

class NonTeaching extends EmployOffice {
  // Konstruktor
  public NonTeaching(int empNo, String empName, int salary, String designation) {
    super(empNo, empName, salary, designation);
  }
}

public class Main {
  private static Scanner scanner;

  public static void main(String[] args) {
    scanner = new Scanner(System.in);

    System.out.println("Data about Teaching class => \n");
    System.out.print("Enter Employ number => ");
    int empNoTeaching = scanner.nextInt();
    System.out.print("Enter Employ name => ");
    String empNameTeaching = scanner.next();
    System.out.print("Enter salary => ");
    int salaryTeaching = scanner.nextInt();
    System.out.print("Enter designation => ");
    String designationTeaching = scanner.next();

    Teaching t1 = new Teaching(empNoTeaching, empNameTeaching, salaryTeaching, designationTeaching);
    t1.displayData();

    System.out.println("\n\nData about Non teaching class => \n");
    System.out.print("Enter Employ number => ");
    int empNoNonTeaching = scanner.nextInt();
    System.out.print("Enter Employ name => ");
    String empNameNonTeaching = scanner.next();
    System.out.print("Enter salary => ");
    int salaryNonTeaching = scanner.nextInt();
    System.out.print("Enter designation => ");
    String designationNonTeaching = scanner.next();

    NonTeaching nt1 = new NonTeaching(empNoNonTeaching, empNameNonTeaching, salaryNonTeaching, designationNonTeaching);
    nt1.displayData();

  }
}
