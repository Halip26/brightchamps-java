# Bubble Sort

## Pengertian

**Bubble Sort** adalah salah satu algoritma pengurutan (sorting) sederhana yang bekerja dengan cara membandingkan elemen yang berdekatan dan menukarnya jika urutannya salah. Proses ini diulang terus hingga seluruh elemen dalam array terurut.

## Cara Kerja Bubble Sort

1. Bandingkan elemen pertama dengan elemen kedua.
2. Jika elemen pertama lebih besar, tukar posisinya.
3. Lanjutkan ke pasangan berikutnya hingga akhir array.
4. Setelah satu iterasi, elemen terbesar akan berada di posisi terakhir.
5. Ulangi proses untuk sisa elemen hingga tidak ada lagi pertukaran.

## Ilustrasi

Misal array: `[5, 3, 8, 4, 2]`

- Iterasi 1: `[3, 5, 4, 2, 8]`
- Iterasi 2: `[3, 4, 2, 5, 8]`
- Iterasi 3: `[3, 2, 4, 5, 8]`
- Iterasi 4: `[2, 3, 4, 5, 8]`

## Kode Contoh Java

```java
class Bubble_Sort {
    int arr[];

    public void input(int size) {
        arr = new int[size];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void sort() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

## Kelebihan dan Kekurangan

**Kelebihan:**

- Mudah dipahami dan diimplementasikan.
- Cocok untuk data berukuran kecil.

**Kekurangan:**

- Tidak efisien untuk data berukuran besar (kompleksitas waktu O(n²)).
- Banyak melakukan pertukaran meskipun array hampir terurut.

## Kompleksitas Waktu

- **Terburuk (Worst Case):** O(n²)
- **Rata-rata (Average Case):** O(n²)
- **Terbaik (Best Case):** O(n) jika sudah terurut

---

> Bubble Sort cocok digunakan untuk pembelajaran konsep sorting, namun kurang efisien untuk data besar.
