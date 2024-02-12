# **Pengantar Pemrograman Berorientasi Objek (OOP) dengan Java**

---

## **Pendahuluan**

Pemrograman Berorientasi Objek (OOP) adalah paradigma pemrograman yang berfokus pada objek dan interaksi antara objek. Java adalah bahasa pemrograman yang sangat populer untuk pengembangan aplikasi berbasis OOP. Dalam materi ini, kita akan membahas konsep-konsep dasar OOP dan bagaimana mereka diterapkan dalam Java.

## **Konsep Utama OOP**

1. **Kelas dan Objek**:
    - Kelas adalah blueprint atau cetakan untuk membuat objek.
    - Objek adalah instance dari kelas yang memiliki atribut (variabel) dan perilaku (metode).

2. **Enkapsulasi**:
    - Enkapsulasi adalah konsep menyembunyikan detail implementasi dan hanya mengekspos fungsionalitas yang diperlukan.
    - Ini dilakukan dengan menggunakan modifier akses (public, private, protected) untuk mengontrol akses ke variabel dan metode.

3. **Pewarisan**:
    - Pewarisan memungkinkan kelas baru (subclass) untuk mewarisi sifat dan perilaku dari kelas yang sudah ada (superclass).
    - Ini memungkinkan untuk hierarki kelas dan penggunaan kembali kode.

4. **Polimorfisme**:
    - Polimorfisme memungkinkan objek dari kelas yang berbeda untuk merespons dengan cara yang berbeda terhadap panggilan metode yang sama.
    - Ini bisa dicapai melalui overloading (pemanggilan metode dengan nama yang sama tetapi parameter yang berbeda) dan overriding (mengimplementasikan kembali metode yang sudah didefinisikan dalam superclass).

## **Contoh Implementasi OOP dalam Java**

Berikut ini adalah contoh implementasi sederhana dari konsep-konsep OOP dalam Java:

```java
// Definisikan kelas
class Car {
    // Atribut
    private String brand;
    private String model;
    
    // Konstruktor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    
    // Metode
    public void drive() {
        System.out.println("Driving the " + brand + " " + model);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Car
        Car myCar = new Car("Toyota", "Corolla");
        
        // Memanggil metode drive()
        myCar.drive();
    }
}
```

## **Kesimpulan**

Java adalah bahasa pemrograman yang kuat untuk pengembangan aplikasi berbasis OOP. Dengan konsep-konsep dasar seperti kelas, objek, enkapsulasi, pewarisan, dan polimorfisme, Anda dapat membuat kode yang mudah dipahami, dapat dipelihara, dan dapat digunakan kembali. Dengan memahami prinsip OOP, Anda dapat mengembangkan aplikasi yang lebih efisien dan skalabel dalam Java.
