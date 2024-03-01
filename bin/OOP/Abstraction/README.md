# **Pengantar Konsep Abstraksi dan Penyembunyian Data dalam Java**

---

## **Pendahuluan**

Dalam pemrograman berorientasi objek, konsep abstraksi dan penyembunyian data sangat penting. Abstraksi memungkinkan kita untuk menyembunyikan detail implementasi yang kompleks dan hanya mengekspos fungsionalitas yang relevan, sementara penyembunyian data memungkinkan kita untuk melindungi data dari akses langsung oleh kelas lain. Dalam Java, konsep ini dapat diimplementasikan menggunakan kelas abstrak, metode abstrak, dan metode getter dan setter.

## **1. Konsep Kelas Abstrak (Abstract Class)**

Kelas abstrak adalah kelas yang tidak dapat diinstansiasi langsung, tetapi dapat memiliki metode non-abstrak dan abstrak. Kelas abstrak sering digunakan untuk menyediakan kerangka kerja umum untuk kelas-kelas turunannya.

## **Contoh Implementasi:**

```java
abstract class Shape {
    abstract void draw(); // Metode abstrak
}
```

## **2. Metode Abstrak (Abstract Method)**

Metode abstrak adalah metode yang tidak memiliki implementasi dan hanya dideklarasikan dalam kelas abstrak. Kelas turunan dari kelas abstrak harus mengimplementasikan semua metode abstrak yang dideklarasikan oleh kelas induknya.

**Contoh Implementasi:**

```java
abstract class Shape {
    abstract void draw(); // Metode abstrak
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}
```

## **3. Konsep Penyembunyian Data (Data Hiding)**

Penyembunyian data adalah konsep dimana detail implementasi dari suatu kelas disembunyikan dari kelas lain dan hanya metode yang ditentukan yang dapat mengakses atau memanipulasi data tersebut.

## **4. Metode Getter dan Setter**

Metode getter digunakan untuk mengambil nilai dari suatu variabel (mengakses data), sedangkan metode setter digunakan untuk menetapkan nilai untuk suatu variabel (mengubah data). Metode getter dan setter membantu dalam melaksanakan konsep penyembunyian data.

**Contoh Implementasi:**

```java
class Student {
    private String name; // Variabel yang disembunyikan

    // Metode getter
    public String getName() {
        return name;
    }

    // Metode setter
    public void setName(String newName) {
        name = newName;
    }
}
```

## **Kesimpulan**

Konsep abstraksi dan penyembunyian data sangat penting dalam pengembangan aplikasi berorientasi objek yang aman dan mudah dimengerti. Dalam Java, konsep ini dapat diimplementasikan menggunakan kelas abstrak, metode abstrak, getter, dan setter. Dengan menggunakan abstraksi dan penyembunyian data, kita dapat membuat kode yang lebih fleksibel, terstruktur, dan aman.

---

## **Implementasi Penggunaan Abstraksi dalam Java**
