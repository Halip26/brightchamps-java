# Interfaces di Java

Interfaces adalah salah satu konsep kunci dalam pemrograman berorientasi objek (OOP) di Java. Mereka digunakan untuk mendefinisikan sebuah kontrak yang harus diimplementasikan oleh kelas-kelas lain. Dengan menggunakan interfaces, Kamu dapat membuat kode yang lebih fleksibel, mudah di-maintain, dan memungkinkan untuk polimorfisme.

## Apa itu Interface?

Interface adalah sebuah kumpulan dari metode-metode yang belum diimplementasikan (hanya memiliki deklarasi metode, tanpa isi atau tubuh metode). Interface digunakan untuk mendefinisikan perilaku yang harus dimiliki oleh objek yang menggunakan interface tersebut.

Berikut adalah contoh deklarasi sebuah interface di Java:

```java
public interface Animal {
    void makeSound();
    void eat();
}
```

Dalam contoh di atas, kita mendefinisikan sebuah interface `Animal` yang memiliki dua metode: `makeSound()` dan `eat()`. Setiap kelas yang mengimplementasikan interface `Animal` harus menyediakan implementasi untuk kedua metode tersebut.

## Mengimplementasikan Interface

Untuk menggunakan sebuah interface, kelas harus mengimplementasikan (implement) interface tersebut. Untuk melakukan hal ini, kelas tersebut harus menggunakan kata kunci `implements`.

Berikut adalah contoh implementasi interface `Animal`:

```java
public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void eat() {
        System.out.println("Eating bones");
    }
}
```

Pada contoh di atas, kelas `Dog` mengimplementasikan interface `Animal` dengan memberikan implementasi untuk metode `makeSound()` dan `eat()`.

## Menggunakan Interface

Setelah sebuah kelas mengimplementasikan sebuah interface, Kamu dapat menggunakan objek dari kelas tersebut melalui referensi dari interface. Ini memungkinkan Kamu untuk menggunakan polimorfisme di Java.

Berikut adalah contoh penggunaan interface:

```java
public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
        animal.eat();
    }
}
```

Pada contoh di atas, kita membuat objek `Dog` dan menyimpannya dalam variabel bertipe `Animal`. Ini memungkinkan kita untuk menggunakan metode `makeSound()` dan `eat()` yang didefinisikan dalam interface `Animal`.

## Keuntungan Menggunakan Interface

1. **Polimorfisme**: Interfaces memungkinkan Kamu menggunakan polimorfisme di Java, yang memungkinkan Kamu untuk merujuk pada objek berbeda dengan menggunakan referensi yang sama.
2. **Abstraksi**: Interfaces memungkinkan Kamu untuk mendefinisikan sebuah kontrak tanpa memberikan implementasi, sehingga memungkinkan abstraksi dari detail implementasi.
3. **Fleksibilitas**: Interfaces memungkinkan Kamu untuk memisahkan spesifikasi (interface) dari implementasi, sehingga memungkinkan untuk fleksibilitas dan perubahan implementasi di masa depan.

## Kesimpulan

Interfaces adalah salah satu fitur penting dalam pemrograman berorientasi objek di Java. Mereka digunakan untuk mendefinisikan sebuah kontrak yang harus diikuti oleh kelas lain, dan memungkinkan untuk polimorfisme dan abstraksi. Dengan menggunakan interfaces, Kamu dapat membuat kode yang lebih fleksibel dan mudah di-maintain.

---

## **Materi: Konsep Interface dalam Pemrograman Berorientasi Objek (OOP) dengan Java**

**Proyek utama tentang Interface di bawah ini** :

[Main.java](Main.java)

Kode tersebut merupakan contoh implementasi dari konsep pemrograman berorientasi objek (OOP) menggunakan Java, dengan menggunakan interface dan beberapa kelas yang mengimplementasikan interface tersebut. Berikut penjelasan dari setiap bagian kode:

1. `interface remotecontrol`:
   - Ini adalah sebuah interface yang mendefinisikan perilaku untuk perangkat remote control.
   - Interface ini memiliki empat metode:
     - `turnon()`: Mengaktifkan perangkat.
     - `turnoff()`: Mematikan perangkat.
     - `set_temperature(int temp)`: Mengatur suhu pada perangkat.
     - `set_Timer()`: Metode default yang memberikan implementasi sederhana, yaitu mencetak pesan bahwa timer sudah diaktifkan.

2. `class Airconditioner implements remotecontrol`:
   - Kelas `Airconditioner` mengimplementasikan interface `remotecontrol`.
   - Kelas ini memiliki implementasi untuk semua metode yang didefinisikan di dalam interface `remotecontrol`.
   - Metode `turnon()`, `turnoff()`, dan `set_temperature(int user_temp)` diimplementasikan sesuai dengan perilaku AC.

3. `class Bulb implements remotecontrol`:
   - Kelas `Bulb` juga mengimplementasikan interface `remotecontrol`.
   - Seperti `Airconditioner`, kelas ini memiliki implementasi untuk semua metode yang didefinisikan di dalam interface `remotecontrol`.
   - Metode `turnon()`, `turnoff()`, dan `set_temperature(int user_temp)` diimplementasikan sesuai dengan perilaku lampu.

4. `public class Main`:
   - Kelas `Main` merupakan kelas utama yang berisi metode `main()`, yang merupakan titik awal eksekusi program.
   - Pada metode `main()`, objek `Airconditioner` dan `Bulb` dibuat.
   - Kemudian, beberapa metode dipanggil pada objek `Airconditioner` dan `Bulb` untuk menunjukkan fungsionalitas yang diimplementasikan.

Selain itu, kode ini juga menunjukkan penggunaan metode default dalam interface Java, yang memungkinkan penambahan fungsionalitas baru ke dalam interface tanpa mempengaruhi kelas yang sudah ada yang mengimplementasikan interface tersebut.

```java
default void set_Timer() {
    System.out.println("Timer is ON");
  }

```

**Pada potongan kode diatas adalah:**

Metode default `set_Timer()` adalah sebuah metode dalam sebuah interface Java yang diberi implementasi default. Dalam Java, mulai dari versi 8, interface dapat memiliki metode default, yaitu metode yang menyediakan implementasi default di dalam interface itu sendiri. Implementasi default ini memungkinkan pengembang untuk menambahkan fungsionalitas baru ke dalam interface tanpa mempengaruhi kelas yang sudah ada yang mengimplementasikan interface tersebut.

Dalam contoh kode yang diberikan, metode default `set_Timer()` memberikan implementasi sederhana yang mencetak pesan "Timer is ON". Metode ini bisa dipanggil dari objek yang mengimplementasikan interface `remotecontrol`, seperti yang ditunjukkan dalam metode `main()` di kelas `Main`. Jika kelas yang mengimplementasikan interface `remotecontrol` tidak mengoverride metode `set_Timer()`, maka metode default ini akan digunakan secara otomatis.
