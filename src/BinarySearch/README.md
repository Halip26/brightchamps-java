# **Binary Search di Java**

## **Pendahuluan**

Binary Search adalah algoritma pencarian yang efisien untuk menemukan posisi sebuah elemen dalam array yang sudah terurut. Algoritma ini bekerja dengan membandingkan elemen yang dicari dengan elemen tengah array, lalu mempersempit pencarian ke setengah bagian array yang relevan.

## **Syarat Binary Search**

- Array harus **sudah terurut** (ascending/menaik).
- Cocok digunakan untuk array berukuran besar karena lebih cepat dibandingkan linear search.

## **Langkah-langkah Algoritma**

1. Tentukan indeks awal (`left`) dan akhir (`right`) dari array.
2. Selama `left` ≤ `right`:
   - Hitung indeks tengah: `mid = left + (right - left) / 2`
   - Jika elemen tengah sama dengan elemen yang dicari (`key`), pencarian selesai.
   - Jika elemen tengah lebih kecil dari `key`, cari di bagian kanan (`left = mid + 1`).
   - Jika elemen tengah lebih besar dari `key`, cari di bagian kiri (`right = mid - 1`).
3. Jika elemen tidak ditemukan, kembalikan informasi bahwa elemen tidak ada di array.

## **Contoh Implementasi di Java**

```java
import java.util.Arrays;
import java.util.Scanner;

public class IntBinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of list :");
        int len = scan.nextInt();
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("Enter the number" + (i + 1) + " in the list : ");
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array " + Arrays.toString(arr));
        System.out.print("\nEnter the number to be searched: ");
        int key = scan.nextInt();
        int left = 0, right = len - 1;
        boolean found = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                System.out.println("Number is found at index : " + mid);
                found = true;
                break;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (!found) {
            System.out.println("your Searched number " + key + " is not found");
        }
    }
}
```

## **Kelebihan Binary Search**

- Kompleksitas waktu **O(log n)**, jauh lebih cepat dari linear search (**O(n)**).
- Cocok untuk data yang besar dan sudah terurut.

## **Kekurangan**

- Hanya bisa digunakan pada array/list yang sudah terurut.
- Tidak cocok untuk data yang sering berubah (karena harus diurutkan ulang).

## **Kesimpulan**

Binary Search adalah teknik pencarian yang sangat efisien untuk data terurut. Dengan memahami dan mengimplementasikan algoritma ini, kamu dapat meningkatkan performa aplikasi yang membutuhkan operasi pencarian data.
