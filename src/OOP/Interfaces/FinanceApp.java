package OOP.Interfaces;

// Definisi Interface
interface FinanceManager {
  void addTransaction(String type, double amount);

  double viewBalance();

  void generateReport();
}

// Implementasi Interface
class PersonalFinance implements FinanceManager {
  private double balance = 0;
  private StringBuilder report = new StringBuilder();

  @Override
  public void addTransaction(String type, double amount) {
    if (type.equalsIgnoreCase("income")) {
      balance += amount;
      report.append("Income: ").append(amount).append("\n");
    } else if (type.equalsIgnoreCase("expense")) {
      balance -= amount;
      report.append("Expense: ").append(amount).append("\n");
    } else {
      System.out.println("Invalid transaction type.");
    }
  }

  @Override
  public double viewBalance() {
    return balance;
  }

  @Override
  public void generateReport() {
    System.out.println("Transaction Report:");
    System.out.println(report.toString());
    System.out.println("Current Balance: " + balance);
  }
}

// Main Class
public class FinanceApp {
  public static void main(String[] args) {
    FinanceManager manager = new PersonalFinance();

    // Contoh penggunaan
    manager.addTransaction("income", 5000); // Pendapatan
    manager.addTransaction("expense", 1200); // Pengeluaran
    manager.addTransaction("income", 1500); // Pendapatan tambahan

    System.out.println("Current Balance: " + manager.viewBalance()); // Melihat saldo
    manager.generateReport(); // Membuat laporan
  }
}
