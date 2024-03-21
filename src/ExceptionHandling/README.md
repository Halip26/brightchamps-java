# Materi: Exception Handling di Java

## 1. Pengenalan Exception Handling

Exception handling adalah sebuah mekanisme dalam pemrograman Java yang memungkinkan programmer untuk menangani kesalahan atau kondisi tak terduga yang dapat terjadi saat program dijalankan. Kesalahan tersebut dapat berupa kesalahan sintaksis, kesalahan logika, atau kejadian tak terduga lainnya yang dapat mengakibatkan program berhenti atau tidak berjalan dengan semestinya.

## 2. Jenis-jenis Exception

Ada dua jenis exception dalam Java:

- **Checked Exception**: Exception yang harus dideklarasikan dalam blok `try-catch` atau dilemparkan (`throws`) pada method yang memanggilnya pada saat kompilasi. Contohnya adalah `IOException`, `SQLException`, dll.

- **Unchecked Exception (RuntimeException)**: Exception yang tidak harus ditangkap atau dideklarasikan secara eksplisit. Biasanya disebabkan oleh kesalahan dalam kode program, seperti pembagian oleh nol (`ArithmeticException`), akses indeks array di luar batas (`ArrayIndexOutOfBoundsException`), dll.

## 3. Mekanisme Exception Handling

Exception handling menggunakan beberapa pernyataan khusus dalam Java:

- **try**: Blok kode yang berpotensi menimbulkan exception. Pada blok ini, kode yang berpotensi menimbulkan exception ditempatkan.

- **catch**: Blok yang menangkap exception yang dihasilkan oleh blok `try`. Pada blok ini, penanganan exception dilakukan.

- **finally**: Blok yang digunakan untuk mengeksekusi kode terlepas dari apakah exception terjadi atau tidak. Biasanya digunakan untuk membersihkan sumber daya seperti file atau koneksi database.

- **throw**: Digunakan untuk melemparkan sebuah exception secara manual.

- **throws**: Digunakan pada deklarasi method untuk menunjukkan bahwa method tersebut dapat melemparkan exception tertentu.

## 4. Contoh Penggunaan

```java
import java.io.*;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("input.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.err.println("Error in closing BufferedReader: " + e.getMessage());
            }
        }
    }
}
```

### 5. Best Practices

- **Spesifik dalam Menangkap Exception**: Selalu tangkap exception sesuai dengan jenisnya untuk penanganan yang lebih tepat.

- **Jangan Tangkap Semua Exception Secara Umum**: Menghindari menangkap `Exception` secara umum karena hal ini dapat menyembunyikan kesalahan yang sebenarnya.

- **Gunakan `finally` untuk Resource Cleanup**: Tempatkan kode pembersihan sumber daya, seperti menutup koneksi atau file, di blok `finally`.

- **Log Exception Information**: Saat menangkap exception, log informasi tambahan seperti stack trace untuk memudahkan debugging.

#### Kesimpulan

Exception handling adalah bagian penting dari pengembangan aplikasi Java yang dapat membantu meningkatkan robustness dan kehandalan program. Dengan menggunakan mekanisme exception handling dengan benar, programmer dapat mengidentifikasi, menangani, dan memulihkan aplikasi dari kondisi tak terduga yang mungkin terjadi saat runtime.

## **Contoh Proyek: Aplikasi Pengelolaan Inventaris**

**Deskripsi Proyek:**
Buatlah sebuah aplikasi pengelolaan inventaris sederhana menggunakan Java. Aplikasi ini akan memiliki fitur untuk menambahkan barang ke dalam inventaris, menghapus barang dari inventaris, dan mencetak daftar barang yang ada.

**Fitur Aplikasi:**

1. **Tambah Barang**: Pengguna dapat menambahkan barang ke dalam inventaris. Jika barang sudah ada, aplikasi akan menampilkan pesan kesalahan.
2. **Hapus Barang**: Pengguna dapat menghapus barang dari inventaris berdasarkan nama barang. Jika barang tidak ditemukan, aplikasi akan menampilkan pesan kesalahan.
3. **Cetak Daftar Barang**: Aplikasi akan mencetak daftar semua barang yang ada dalam inventaris.

**Implementasi Exception Handling:**

- Gunakan Exception Handling untuk menangani kasus-kasus seperti:
  - Penambahan barang yang sudah ada dalam inventaris.
  - Penghapusan barang yang tidak ditemukan dalam inventaris.
  - Kesalahan saat mencetak daftar barang.
- Manfaatkan blok Try-Catch untuk menangani Exception.
- Pastikan setiap operasi pada inventaris ditangani dengan benar untuk menghindari kegagalan aplikasi.

**Contoh Kode:**

[Main.java](Main.java)

Dalam contoh proyek ini, Exception Handling digunakan untuk menangani kondisi-kondisi yang mungkin terjadi saat pengelolaan inventaris, seperti penambahan barang yang sudah ada, penghapusan barang yang tidak ditemukan, dan kesalahan saat mencetak daftar barang.
