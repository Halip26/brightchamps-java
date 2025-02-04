# **Pengantar Polimorfisme dalam Java**

---

## **Pendahuluan**

Polimorfisme adalah salah satu konsep utama dalam pemrograman berorientasi objek yang memungkinkan objek untuk menunjukkan perilaku yang berbeda tergantung pada konteks di mana mereka digunakan. Dalam Java, terdapat dua jenis polimorfisme: pengikatan statis dan pengikatan dinamis. Selain itu, polimorfisme juga dapat diterapkan melalui overloading dan overriding metode.

## **1. Pengikatan Statis (Compile-Time Polymorphism)**

Pengikatan statis terjadi pada saat kompilasi dan terkait dengan konsep overloading metode. Overloading metode memungkinkan kita untuk mendefinisikan beberapa metode dengan nama yang sama dalam kelas yang sama, tetapi dengan parameter yang berbeda.

## **Contoh Overloading Metode:**

```java
class Calculator {
    // Overloading metode untuk menghitung jumlah
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
```

Pada contoh di atas, kita memiliki dua metode `add`, satu untuk menjumlahkan bilangan bulat dan satu lagi untuk menjumlahkan bilangan pecahan.

## **2. Pengikatan Dinamis (Runtime Polymorphism)**

Pengikatan dinamis terjadi pada saat runtime dan terkait dengan konsep overriding metode. Overriding metode memungkinkan subclass untuk memberikan implementasi yang berbeda dari metode yang sudah didefinisikan dalam superclass.

## **Contoh Overriding Metode:**

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
```

Pada contoh di atas, kita memiliki metode `sound` yang dioverride oleh kelas `Dog` untuk menghasilkan suara "Dog barks" daripada "Animal makes a sound".

## **Studi Perbandingan**

## **Overloading Metode vs. Overriding Metode**

1. **Overloading Metode**:
   - Terjadi dalam satu kelas.
   - Nama metode sama, tetapi parameter berbeda.
   - Pengikatan statis (compile-time).
   - Digunakan ketika perilaku metode berbeda tergantung pada jenis argumen.

2. **Overriding Metode**:
   - Terjadi antara superclass dan subclass.
   - Nama metode dan parameter yang sama.
   - Pengikatan dinamis (runtime).
   - Digunakan untuk menyediakan implementasi yang berbeda untuk metode yang sudah didefinisikan dalam superclass.

## **Kesimpulan**

Polimorfisme adalah konsep penting dalam pemrograman berorientasi objek yang memungkinkan fleksibilitas dalam perilaku objek. Dalam Java, polimorfisme dapat dicapai melalui overloading dan overriding metode. Overloading memungkinkan kita untuk mendefinisikan metode dengan nama yang sama tetapi parameter yang berbeda, sementara overriding memungkinkan subclass untuk memberikan implementasi yang berbeda dari metode yang sudah didefinisikan dalam superclass. Dengan pemahaman yang baik tentang kedua konsep ini, Anda dapat merancang kode yang lebih fleksibel dan mudah di-maintain dalam pengembangan aplikasi Java Anda.

---

## **Penggunaan Polimorfisme dalam Java: Contoh Overloading Metode**

### Pendahuluan

Polimorfisme adalah salah satu konsep utama dalam pemrograman berorientasi objek yang memungkinkan objek untuk menunjukkan perilaku yang berbeda tergantung pada konteks di mana mereka digunakan. Salah satu bentuk polimorfisme dalam Java adalah penggunaan overloading metode. Overloading metode memungkinkan kita untuk mendefinisikan beberapa metode dengan nama yang sama dalam satu kelas, tetapi dengan parameter yang berbeda.

### **Contoh Implementasi:**

```java
class Shapes {
    // Metode untuk menghitung luas tanpa parameter
    public void area() {
        System.out.println("Find area ");
    }

    // Metode untuk menghitung luas lingkaran dengan parameter radius
    public void area(int r) {
        System.out.println("Circle area = " + 3.14 * r * r);
    }

    // Metode untuk menghitung luas segitiga dengan parameter base dan height
    public void area(double b, double h) {
        System.out.println("Triangle area = " + 0.5 * b * h);
    }

    // Metode untuk menghitung luas persegi panjang dengan parameter length dan width
    public void area(int l, int b) {
        System.out.println("Rectangle area = " + l * b);
    }
}
```

### **Penerapan Polimorfisme:**

```java
public class Main {
    public static void main(String[] args) {
        Shapes myShape = new Shapes();  // Membuat objek Shapes

        // Memanggil metode area tanpa argumen
        myShape.area();

        // Memanggil metode area dengan satu argumen (radius)
        myShape.area(5);

        // Memanggil metode area dengan dua argumen (base dan height)
        myShape.area(6.0, 1.2);

        // Memanggil metode area dengan dua argumen (length dan width)
        myShape.area(6, 2);
    }
}
```

### Kesimpulan

Overloading metode adalah bentuk polimorfisme dalam Java yang memungkinkan kita untuk mendefinisikan beberapa metode dengan nama yang sama dalam satu kelas, tetapi dengan parameter yang berbeda. Dengan menggunakan overloading metode, kita dapat membuat kode yang lebih fleksibel dan mudah digunakan, karena kita dapat memanggil metode dengan cara yang sama namun dengan argumen yang berbeda tergantung pada kebutuhan kita. Ini merupakan salah satu aspek penting dari polimorfisme dalam pemrograman berorientasi objek.
