package Constructors;

import java.util.Scanner;

class MenuMakanan {
  String nama;
  double harga;

  MenuMakanan(String nama, double harga) {
    this.nama = nama;
    this.harga = harga;
  }

  void tampilkanMenu() {
    System.out.println(nama + " - Rp " + harga);
  }
}

public class Main {
  private static Scanner input;

  public static void main(String[] args) {
    input = new Scanner(System.in);

    MenuMakanan[] menu = {
        new MenuMakanan("Nasi Goreng", 20000),
        new MenuMakanan("Mie Ayam", 15000),
        new MenuMakanan("Es Teh", 5000)
    };

    System.out.println("=== Menu Makanan ===");
    for (int i = 0; i < menu.length; i++) {
      System.out.println((i + 1) + ". " + menu[i].nama + " - Rp " + menu[i].harga);
    }

    System.out.print("Pilih nomor menu: ");
    int pilihan = input.nextInt();

    if (pilihan < 1 || pilihan > menu.length) {
      System.out.println("Pilihan tidak valid!");
    } else {
      MenuMakanan pesanan = menu[pilihan - 1];
      System.out.println("\nAnda memilih: " + pesanan.nama + " - Rp " + pesanan.harga);

      System.out.print("Apakah Anda ingin membeli ini? (ya/tidak): ");
      String konfirmasi = input.next();

      if (konfirmasi.equalsIgnoreCase("ya")) {
        System.out.println("Pesanan berhasil! Terima kasih telah membeli " + pesanan.nama + ".");
      } else {
        System.out.println("Pesanan dibatalkan.");
      }
    }

  }
}