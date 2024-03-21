package ExceptionHandling;

import java.util.ArrayList;

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
    public static void main(String[] args) {
        Inventaris inventaris = new Inventaris();

        try {
            inventaris.tambahBarang(new Barang("Buku", 10));
            inventaris.tambahBarang(new Barang("Pensil", 20));
            inventaris.tambahBarang(new Barang("Buku", 5)); // Penambahan barang yang sudah ada
        } catch (IllegalArgumentException e) {
            System.out.println("Gagal menambahkan barang: " + e.getMessage());
        }

        inventaris.cetakDaftarBarang();

        try {
            inventaris.hapusBarang("Pensil");
            inventaris.hapusBarang("Penghapus"); // Penghapusan barang yang tidak ditemukan
        } catch (IllegalArgumentException e) {
            System.out.println("Gagal menghapus barang: " + e.getMessage());
        }

        inventaris.cetakDaftarBarang();
    }
}
