package Constructors;

import java.util.Scanner;

// Class untuk merepresentasikan tiket kereta
class TiketKereta {
  private String namaPenumpang;
  private String tujuan;
  private int nomorKereta;
  private double harga;

  // constructor untuk menginisialisasi objek TiketKereta
  public TiketKereta(String namaPenumpang, String tujuan, int nomorKereta, double harga) {
    this.namaPenumpang = namaPenumpang;
    this.tujuan = tujuan;
    this.nomorKereta = nomorKereta;
    this.harga = harga;
  }

  // metode untuk menampilkan informasi tiket
  public void tampilkanInfoTiket() {
    System.out.println("");
    System.out.println("Nama Penumpang: \t\t" + namaPenumpang);
    System.out.println("Tujuan: \t\t" + tujuan);
    System.out.println("Nomor Kereta: \t\t" + nomorKereta);
    System.out.println("Harga: \t\t" + harga);
  }
}

public class PemesananTiketKereta {
  private static Scanner scanner;

  public static void main(String[] args) {
    scanner = new Scanner(System.in);

    System.out.print("Masukkan nama penumpang: ");
    String namaPenumpang = scanner.nextLine();

    System.out.print("Masukkan tujuan: ");
    String tujuan = scanner.nextLine();

    System.out.print("Masukkan nomor kereta: ");
    int nomorKereta = scanner.nextInt();

    System.out.print("Masukkan harga tiket: ");
    double harga = scanner.nextDouble();

    // Membuat objek TiketKereta menggunakan constructor
    TiketKereta tiket = new TiketKereta(namaPenumpang, tujuan, nomorKereta, harga);

    // Menampilkan informasi tiket
    tiket.tampilkanInfoTiket();
  }
}
