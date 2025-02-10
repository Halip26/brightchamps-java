package Arrays;

import java.util.Scanner;

public class InventoriBarang {
  public static Scanner input;

  public static void main(String[] args) {
    input = new Scanner(System.in);

    System.out.print("Masukkan jumlah barang: ");
    int jumlahBarang = input.nextInt();
    input.nextLine();

    String[] barang = new String[jumlahBarang];
    int[] stock = new int[jumlahBarang];

    for (int i = 0; i < jumlahBarang; i++) {
      System.out.print("Masukkan nama barang ke-" + (i + 1) + ": ");
      barang[i] = input.nextLine();

      System.out.print("Masukkan stock " + barang[i] + ": ");
      stock[i] = input.nextInt();
      input.nextLine(); // clear new line
    }

    System.out.println("\n--- Daftar Barang ---");
    for (int i = 0; i < jumlahBarang; i++) {
      System.out.println("Barang: " + barang[i] + "\nStock: " + stock[i]);
    }
  }
}
