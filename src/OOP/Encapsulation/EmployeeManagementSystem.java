package OOP.Encapsulation;

// Kelas untuk merepresentasikan Pegawai
class Employee {
  private String name;
  private double salary;
  private int employeeId;

  // Konstruktor
  public Employee(String name, double salary, int employeeId) {
    this.name = name;
    this.salary = salary;
    this.employeeId = employeeId;
  }

  // Metode untuk mengambil nama pegawai
  public String getName() {
    return name;
  }

  // Metode untuk mengatur nama pegawai
  public void setName(String name) {
    this.name = name;
  }

  // Metode untuk mengambil gaji pegawai
  public double getSalary() {
    return salary;
  }

  // Metode untuk mengatur gaji pegawai
  public void setSalary(double salary) {
    this.salary = salary;
  }

  // Metode untuk mengambil ID pegawai
  public int getEmployeeId() {
    return employeeId;
  }

  // Metode untuk menampilkan informasi pegawai
  public void displayInfo() {
    System.out.println("Employee ID: " + employeeId);
    System.out.println("Name: " + name);
    System.out.println("Salary: $" + salary);
  }
}

public class EmployeeManagementSystem {
  public static void main(String[] args) {
    // Membuat objek pegawai
    Employee employee1 = new Employee("John Doe", 50000, 1001);

    // Menampilkan informasi pegawai
    System.out.println("Employee Information:");
    employee1.displayInfo();

    // Mengubah gaji pegawai
    employee1.setSalary(55000);

    // Menampilkan informasi pegawai setelah perubahan gaji
    System.out.println("\nUpdated Employee Information:");
    employee1.displayInfo();
  }
}