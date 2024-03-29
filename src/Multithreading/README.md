# Multithreading dalam Java

## Pengenalan tentang Multithreading

Multithreading merupakan konsep dalam Java yang memungkinkan eksekusi bersamaan dari beberapa thread dalam satu proses. Setiap thread mewakili aliran kontrol terpisah, memungkinkan program untuk melakukan beberapa tugas secara simultan. Dalam Java, multithreading dapat dicapai dengan cara memperluas kelas `Thread` atau mengimplementasikan antarmuka `Runnable`.

### Konsep Dasar

1. **Thread**: Thread merupakan unit eksekusi terkecil dalam sebuah proses. Java menyediakan dukungan bawaan untuk thread melalui kelas `Thread`.

2. **Runnable Interface**: Antarmuka `Runnable` digunakan untuk membuat sebuah thread. Antarmuka ini memerlukan implementasi sebuah metode, `run()`, yang berisi kode yang akan dieksekusi oleh thread.

3. **Status Thread**: Thread dalam Java dapat berada dalam salah satu dari status berikut:
   - **Baru (New)**: Saat thread dibuat namun belum dimulai.
   - **Runnable**: Saat thread siap untuk dieksekusi dan menunggu giliran untuk dipilih untuk dieksekusi oleh CPU.
   - **Blokir/Menunggu (Blocked/Waiting)**: Saat thread sementara tidak aktif karena sedang menunggu peristiwa eksternal seperti operasi I/O atau akuisisi kunci.
   - **Menunggu dengan Waktu Tertentu (Timed Waiting)**: Serupa dengan status Blokir namun dengan waktu habis.
   - **Terminasi (Terminated)**: Saat thread telah menyelesaikan eksekusi atau berakhir karena sebuah pengecualian.

### Membuat Thread

#### Memperluas Kelas `Thread`

```java
class MyThread extends Thread {
    public void run() {
        // Kode thread
    }
}

// Membuat dan memulai thread
MyThread thread = new MyThread();
thread.start();
```

#### Mengimplementasikan Antarmuka `Runnable`

```java
class MyRunnable implements Runnable {
    public void run() {
        // Kode thread
    }
}

// Membuat thread menggunakan antarmuka Runnable
Thread thread = new Thread(new MyRunnable());
thread.start();
```

### Sinkronisasi Thread

Ketika beberapa thread mengakses sumber daya bersama secara bersamaan, hal ini dapat menyebabkan inkonsistensi atau kerusakan data. Sinkronisasi thread memastikan bahwa hanya satu thread yang dapat mengakses sumber daya bersama pada satu waktu, mencegah persaingan data dan menjaga integritas data. Java menyediakan beberapa mekanisme untuk sinkronisasi thread, seperti metode bersinkronisasi, blok bersinkronisasi, dan kunci (locks).

#### Metode Bersinkronisasi

```java
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}
```

#### Blok Bersinkronisasi

```java
class Counter {
    private int count = 0;

    public void increment() {
        synchronized(this) {
            count++;
        }
    }

    public int getCount() {
        synchronized(this) {
            return count;
        }
    }
}
```

### Komunikasi Thread

Komunikasi thread memungkinkan thread untuk mengkoordinasikan aktivitas mereka dan berbagi data. Java menyediakan mekanisme seperti metode wait(), notify(), dan notifyAll() untuk komunikasi thread.

#### Menggunakan wait() dan notify()

```java
class SharedResource {
    private boolean flag = false;

    public synchronized void produce() {
        while (flag) {
            try {
                wait(); // Menunggu sampai konsumen mengonsumsi
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Memproduksi sumber daya
        flag = true;
        notify(); // Memberi tahu konsumen
    }

    public synchronized void consume() {
        while (!flag) {
            try {
                wait(); // Menunggu sampai produsen memproduksi
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Mengonsumsi sumber daya
        flag = false;
        notify(); // Memberi tahu produsen
    }
}
```

### Pengelolaan Thread Pool

Thread pooling adalah teknik di mana sekelompok thread dibuat dan dikelola oleh pengelolaan thread pool. Daripada membuat thread baru untuk setiap tugas, thread dari pool digunakan, yang meningkatkan kinerja dan mengurangi overhead.

#### Menggunakan ExecutorService

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
    public void run() {
        // Kode tugas
    }
}

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5); // Membuat pool thread dengan 5 thread
        for (int i = 0; i < 10; i++) {
            executor.submit(new MyTask()); // Menyerahkan tugas ke pool
        }
        executor.shutdown(); // Mematikan executor
    }
}
```

### Keamanan Thread

Keamanan thread adalah properti dari sebuah program yang memastikan perilaku yang benar ketika dieksekusi secara bersamaan oleh beberapa thread. Teknik seperti sinkronisasi, variabel atomik, dan struktur data yang aman dari thread digunakan untuk mencapai keamanan thread.

### Kesimpulan

Multithreading dalam Java memungkinkan pemanfaatan sumber daya yang efisien dan meningkatkan kinerja program dengan mengeksekusi beberapa tugas secara bersamaan. Namun, hal ini juga memperkenalkan tantangan seperti sinkronisasi thread dan keamanan thread, yang perlu dikelola dengan hati-hati untuk memastikan perilaku program yang benar. Dengan pemahaman dan implementasi yang tepat tentang konsep multithreading, pengembang dapat membangun aplikasi Java yang tangguh dan skalabel.
