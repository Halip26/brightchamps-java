package ExceptionHandling;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Barang {
    private String nama;
    private int jumlah;

    public Barang(String nama, int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }
}

class Inventaris {
    private ArrayList<Barang> daftarBarang;

    public Inventaris() {
        daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(Barang barang) throws IllegalArgumentException {
        for (Barang b : daftarBarang) {
            if (b.getNama().equals(barang.getNama())) {
                throw new IllegalArgumentException("Barang sudah ada dalam inventaris.");
            }
        }
        daftarBarang.add(barang);
    }

    public void hapusBarang(String namaBarang) throws IllegalArgumentException {
        boolean found = false;
        for (Barang barang : daftarBarang) {
            if (barang.getNama().equals(namaBarang)) {
                daftarBarang.remove(barang);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new IllegalArgumentException("Barang tidak ditemukan dalam inventaris.");
        }
    }

    public void cetakDaftarBarang() {
        try {
            for (Barang barang : daftarBarang) {
                System.out.println("Nama: " + barang.getNama() + ", Jumlah: " + barang.getJumlah());
            }
        } catch (Exception e) {
            System.out.println("Gagal mencetak daftar barang: " + e.getMessage());
        }
    }
}

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        Inventaris inventaris = new Inventaris();

        int pilihan;

        do {
            System.out.println("\nMenu Inventaris:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hapus Barang");
            System.out.println("3. Cetak Daftar Barang");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda (1-4): ");

            // Handle potential input mismatch exception (user enters non-integer)
            try {
                pilihan = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka (1-4).");
                scanner.nextLine(); // Clear the scanner buffer after invalid input
                pilihan = -1; // Set pilihan to invalid value to avoid processing
            }

            scanner.nextLine(); // Consume the newline character after nextInt()

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan nama barang: ");
                    String name = scanner.nextLine();

                    System.out.println("Masukkan jumlah barang: ");
                    int jumlah = scanner.nextInt();

                    Barang barang = new Barang(name, jumlah);

                    try {
                        inventaris.tambahBarang(barang);
                        System.out.println("Barang berhasil ditambahkan.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Gagal menambahkan barang: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Masukkan nama barang yang ingin dihapus: ");
                    String namaBarang = scanner.nextLine();

                    try {
                        inventaris.hapusBarang(namaBarang);
                        System.out.println("Barang berhasil dihapus.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Gagal menghapus barang: " + e.getMessage());
                    }
                    break;
                case 3:
                    inventaris.cetakDaftarBarang();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }
}
