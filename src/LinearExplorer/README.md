# Materi Teori: Linear Search dalam Java

## **1. Pengertian Linear Search**

Linear Search adalah salah satu algoritma pencarian sederhana yang digunakan untuk menemukan elemen tertentu (key) dalam sebuah array. Algoritma ini bekerja dengan cara memeriksa setiap elemen array satu per satu, mulai dari indeks pertama hingga elemen terakhir, sampai elemen yang dicari ditemukan atau seluruh elemen telah diperiksa.

## **2. Struktur Program**

Kode yang diberikan adalah implementasi Linear Search dalam Java. Berikut adalah penjelasan dari setiap bagian kode:

---

### **a. Package dan Import**

```java
package LinearExplorer;
import java.util.*;
```

- **`package LinearExplorer;`**: Menentukan bahwa kelas ini berada dalam package bernama `LinearExplorer`.
- **`import java.util.*;`**: Mengimpor semua kelas dalam package `java.util`, termasuk `Scanner` yang digunakan untuk input dari pengguna.

---

### **b. Deklarasi Kelas dan Variabel**

```java
public class Linear_Search {
  public static Scanner scan;
  int arr[]; // deklarasi array
  int location; // menyimpan posisi elemen yang ditemukan
}
```

- **`public class Linear_Search`**: Mendefinisikan kelas utama bernama `Linear_Search`.
- **`Scanner scan`**: Scanner digunakan untuk membaca input dari pengguna.
- **`int arr[]`**: Array untuk menyimpan elemen yang akan dicari.
- **`int location`**: Variabel untuk menyimpan indeks elemen yang ditemukan.

---

### **c. Metode `input()`**

```java
public void input(int n) {
  arr = new int[n]; // Membuat array dengan ukuran n
  scan = new Scanner(System.in); // Membuat objek Scanner
  System.out.println("Please fill the array :");
  for (int i = 0; i < n; i++) {
    System.out.println("Enter the element:");
    arr[i] = scan.nextInt(); // Mengisi array
  }
  System.out.println("The given array is:");
  for (int i = 0; i < n; i++) {
    System.out.print(arr[i] + " "); // Menampilkan array
  }
}
```

- **Fungsi**: Mengisi array dengan elemen yang dimasukkan oleh pengguna dan menampilkan array tersebut.
- **Proses**:
  1. Membuat array dengan ukuran yang ditentukan pengguna.
  2. Menggunakan loop untuk mengisi array dengan elemen yang dimasukkan pengguna.
  3. Menampilkan elemen array setelah selesai diisi.

---

### **d. Metode `search()`**

```java
public boolean search(int key) {
  for (int i = 0; i < arr.length; i++) {
    if (arr[i] == key) {
      location = i; // Menyimpan indeks elemen yang ditemukan
      return true; // Elemen ditemukan
    }
  }
  return false; // Elemen tidak ditemukan
}
```

- **Fungsi**: Mencari elemen tertentu (key) dalam array.
- **Proses**:
  1. Menggunakan loop untuk memeriksa setiap elemen array.
  2. Jika elemen yang dicari ditemukan, indeksnya disimpan dalam variabel `location` dan fungsi mengembalikan `true`.
  3. Jika elemen tidak ditemukan setelah memeriksa seluruh array, fungsi mengembalikan `false`.

---

### **e. Metode `main()`**

```java
public static void main(String args[]) {
  int key, size;
  scan = new Scanner(System.in);
  Linear_Search obj = new Linear_Search();
  System.out.println("Enter the size of the array:");
  size = scan.nextInt(); // Input ukuran array
  obj.input(size); // Memanggil metode input()
  System.out.println("\n Enter the value to search:");
  key = scan.nextInt(); // Input elemen yang dicari
  boolean flag = obj.search(key); // Memanggil metode search()
  if (flag == true) {
    System.out.print("Key found and it is at position :" + (obj.location + 1));
  } else {
    System.out.print("Key not found");
  }
}
```

- **Fungsi**: Mengatur alur program.
- **Proses**:
  1. Meminta pengguna untuk memasukkan ukuran array.
  2. Memanggil metode `input()` untuk mengisi array.
  3. Meminta pengguna untuk memasukkan elemen yang ingin dicari.
  4. Memanggil metode `search()` untuk mencari elemen tersebut.
  5. Menampilkan hasil pencarian (ditemukan atau tidak).

---

## **3. Alur Eksekusi Program**

1. Program meminta pengguna untuk memasukkan ukuran array.
2. Pengguna mengisi elemen array.
3. Program meminta pengguna untuk memasukkan elemen yang ingin dicari.
4. Program mencari elemen tersebut menggunakan metode Linear Search.
5. Jika elemen ditemukan, program menampilkan posisi elemen tersebut (dalam format 1-based index).
6. Jika elemen tidak ditemukan, program menampilkan pesan "Key not found".

---

## **4. Contoh Output**

**Input:**

```bash
Enter the size of the array:
5
Please fill the array :
Enter the element:
10
Enter the element:
20
Enter the element:
30
Enter the element:
40
Enter the element:
50
The given array is:
10 20 30 40 50 
Enter the value to search:
30
```

**Output:**

```bash
Key found and it is at position :3
```

---

## **5. Kelebihan dan Kekurangan Linear Search**

- **Kelebihan**:
  - Mudah diimplementasikan.
  - Tidak memerlukan array yang terurut.
- **Kekurangan**:
  - Tidak efisien untuk array besar karena kompleksitas waktu adalah **O(n)**.

---

## **6. Kompleksitas**

- **Waktu**:
  - Kasus terbaik: **O(1)** (elemen ditemukan di awal).
  - Kasus terburuk: **O(n)** (elemen tidak ditemukan atau berada di akhir).
- **Ruang**: **O(1)** (tidak memerlukan ruang tambahan).

Dengan memahami teori ini, Anda dapat memahami bagaimana Linear Search bekerja dan bagaimana kode di atas mengimplementasikannya.
