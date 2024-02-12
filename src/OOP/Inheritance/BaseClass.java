package OOP.Inheritance;

import java.util.Scanner;

class EmployOffice {
  int empNo;
  String empName;
  int salary;
}

class Teaching extends EmployOffice {
  String designation;

  void setData() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Employ number => ");
    empNo = scanner.nextInt();

    System.out.print("Enter Employ name => ");
    empName = scanner.next();

    System.out.print("Enter salary => ");
    salary = scanner.nextInt();

    System.out.print("Enter designation => ");
    designation = scanner.next();

    scanner.close();
  }

  void getData() {
    System.out.println("Employ name => " + empName + "\t\tEmploy number => " + empNo);
    System.out.println("Salary => " + salary + "\t\tDesignation => " + designation);
  }
}

class Non_teaching extends EmployOffice {
  String designation;

  void setData() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Employ number => ");
    empNo = scanner.nextInt();

    System.out.print("Enter Employ name => ");
    empName = scanner.next();

    System.out.print("Enter salary => ");
    salary = scanner.nextInt();

    System.out.print("Enter designation => ");
    designation = scanner.next();

    scanner.close();
  }

  void getData() {
    System.out.println("Employ name => " + empName + "\t\tEmploy number => " + empNo);
    System.out.println("Salary => " + salary + "\t\tDesignation => " + designation);
  }
}

public class BaseClass {
  public static void main(String[] args) {
    Teaching t1 = new Teaching();
    Non_teaching nt1 = new Non_teaching();

    System.out.println("Data about Teaching class => \n");
    t1.setData();
    t1.getData();

    System.out.println("\n\nData about Non teaching class => \n");
    nt1.setData();
    nt1.getData();

  }
}
