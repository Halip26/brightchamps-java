package FlowControl.SwitchStatement;

import java.util.Scanner;

public class KonversiSuhu {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        System.out.println("Pilih satuan suhu awal:");
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");

        System.out.print("Masukkan pilihan (1-3): ");
        int pilihanAwal = scanner.nextInt();

        System.out.print("Masukkan suhu awal: ");
        double suhuAwal = scanner.nextDouble();

        System.out.println("Pilih satuan suhu yang diinginkan:");
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");

        System.out.print("Masukkan pilihan (1-3): ");
        int pilihanAkhir = scanner.nextInt();

        double suhuAkhir = 0;

        switch (pilihanAwal) {
          case 1:
            // Celcius
            switch (pilihanAkhir) {
              case 1:
                suhuAkhir = suhuAwal;
                break;
              case 2:
                suhuAkhir = (suhuAwal * 9 / 5) + 32;
                break;
              case 3:
                suhuAkhir = suhuAwal + 273.15;
                break;
              default:
                System.out.println("Pilihan satuan suhu akhir tidak valid.");
                break;
            }
            break;
          case 2:
            // Fahrenheit
            switch (pilihanAkhir) {
              case 1:
                suhuAkhir = (suhuAwal - 32) * 5 / 9;
                break;
              case 2:
                suhuAkhir = suhuAwal;
                break;
              case 3:
                suhuAkhir = (suhuAwal - 32) * 5 / 9 + 273.15;
                break;
              default:
                System.out.println("Pilihan satuan suhu akhir tidak valid.");
                break;
            }
            break;
          case 3:
            // Kelvin
            switch (pilihanAkhir) {
              case 1:
                suhuAkhir = suhuAwal - 273.15;
                break;
              case 2:
                suhuAkhir = (suhuAwal - 273.15) * 9 / 5 + 32;
                break;
              case 3:
                suhuAkhir = suhuAwal;
                break;
              default:
                System.out.println("Pilihan satuan suhu akhir tidak valid.");
                break;
            }
            break;
          default:
            System.out.println("Pilihan satuan suhu awal tidak valid.");
            break;
        }
        System.out.println("Hasil konversi suhu: " + suhuAkhir);
      }
    }

  }
}
