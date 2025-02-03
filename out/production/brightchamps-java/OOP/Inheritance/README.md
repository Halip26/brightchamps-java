# **Pengenalan Konsep Pewarisan, Subkelas, dan Superkelas dalam Java Programming**

---

## **Pendahuluan**

Pewarisan adalah salah satu konsep utama dalam pemrograman berorientasi objek (OOP) yang memungkinkan sebuah kelas untuk mewarisi properti dan metode dari kelas lain. Dalam bahasa pemrograman Java, pewarisan memainkan peran penting dalam membangun hierarki kelas yang terstruktur.

## **Konsep Pewarisan**

Pewarisan memungkinkan kelas baru (subclass atau anak kelas) untuk mewarisi atribut dan metode dari kelas yang sudah ada (superclass atau kelas induk). Dengan pewarisan, subclass dapat memperluas atau mengubah perilaku kelas induknya.

## **Subkelas dan Superkelas**

- **Superkelas**: Kelas yang memberikan warisan atau diwarisi oleh kelas lain disebut superkelas.
  
- **Subkelas**: Kelas yang menerima warisan atau mewarisi sifat dan perilaku dari kelas lain disebut subkelas.

## **Jenis-Jenis Pewarisan**

1. **Pewarisan Tunggal**: Subkelas hanya mewarisi dari satu kelas induk.

2. **Pewarisan Ganda**: Subkelas mewarisi dari dua atau lebih kelas induk. Java tidak mendukung pewarisan ganda langsung, namun, dapat diimplementasikan melalui antarmuka (interface).

3. **Pewarisan Bertingkat**: Subkelas mewarisi dari kelas yang juga merupakan subkelas, menciptakan hierarki pewarisan yang berjenjang.

4. **Pewarisan Hirarkis**: Pewarisan dimana terdapat beberapa tingkat kelas turunan dari satu kelas induk.

5. **Pewarisan Hibrida**: Kombinasi dari pewarisan lainnya, seperti pewarisan hirarkis dan bertingkat.

## **Memperluas Kata Kunci**

Dalam Java, untuk mewarisi sifat dan perilaku dari kelas induk, kata kunci `extends` digunakan diikuti oleh nama kelas induk.

```java
class SubClass extends SuperClass {
    // implementasi kelas
}
```

## **Contoh Implementasi**

Misalkan kita memiliki kelas `Animal` sebagai kelas induk:

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
```

Kemudian kita memiliki subkelas `Dog` yang mewarisi kelas `Animal`:

```java
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
```

Dalam contoh ini, `Dog` adalah subkelas yang mewarisi sifat dan metode dari kelas `Animal`.

## **Kesimpulan**

Pewarisan adalah konsep yang penting dalam pemrograman berorientasi objek yang memungkinkan penggunaan kembali kode dan membangun struktur kelas yang terorganisir. Dalam Java, pewarisan memungkinkan pembentukan hierarki kelas yang kompleks dan pengembangan aplikasi yang skalabel.

Dengan pemahaman yang baik tentang konsep pewarisan, subkelas, dan superkelas, serta jenis-jenis pewarisan yang ada, Anda dapat merancang dan mengimplementasikan struktur kelas yang efektif dan mudah di-maintain

---

## **Materi: Pewarisan dalam Pemrograman Berorientasi Objek (OOP) dengan Java**

### **Implementasi Pewarisan dalam Java**

Pada contoh kode yang diberikan, kita memiliki tiga kelas: `EmployOffice`, `Teaching`, dan `NonTeaching`.

1. **Kelas EmployOffice**:
   - Kelas ini berperan sebagai kelas induk atau superclass.
   - Memiliki atribut seperti `empNo`, `empName`, `salary`, dan `designation`.
   - Memiliki konstruktor untuk menginisialisasi atribut.
   - Memiliki metode `displayData()` untuk menampilkan data karyawan.

2. **Kelas Teaching dan NonTeaching**:
   - Keduanya merupakan subclass dari `EmployOffice`, sehingga mewarisi atribut dan metode dari kelas tersebut.
   - Kedua kelas ini memiliki konstruktor yang memanggil konstruktor superclass untuk inisialisasi.
   - Tidak ada metode khusus yang ditambahkan di subclass, karena keduanya hanya menggunakan metode yang diwarisi dari superclass.

### Contoh Implementasi

```java
// Kelas EmployOffice
class EmployOffice {
    int empNo;
    String empName;
    int salary;
    String designation;

    // Konstruktor
    public EmployOffice(int empNo, String empName, int salary, String designation) {
        this.empNo = empNo;
        this.empName = empName;
        this.salary = salary;
        this.designation = designation;
    }

    // Metode untuk menampilkan data
    void displayData() {
        System.out.println("Employ name => " + empName + "\t\tEmploy number => " + empNo);
        System.out.println("Salary => " + salary + "\t\tDesignation => " + designation);
    }
}

// Subkelas Teaching
class Teaching extends EmployOffice {
    // Konstruktor
    public Teaching(int empNo, String empName, int salary, String designation) {
        super(empNo, empName, salary, designation);
    }
}

// Subkelas NonTeaching
class NonTeaching extends EmployOffice {
    // Konstruktor
    public NonTeaching(int empNo, String empName, int salary, String designation) {
        super(empNo, empName, salary, designation);
    }
}

// Kelas utama
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari subkelas Teaching
        Teaching t1 = new Teaching(101, "John Doe", 50000, "Professor");
        // Menampilkan data karyawan
        t1.displayData();

        // Membuat objek dari subkelas NonTeaching
        NonTeaching nt1 = new NonTeaching(201, "Jane Smith", 40000, "Clerk");
        // Menampilkan data karyawan
        nt1.displayData();
    }
}
```

### Kesimpulan

Dengan menggunakan pewarisan, kita dapat mengatur kelas-kelas dalam hierarki yang terstruktur dan mempromosikan penggunaan kembali kode. Dalam Java, konsep pewarisan diimplementasikan dengan menggunakan kata kunci `extends` untuk menunjukkan bahwa sebuah kelas adalah subclass dari kelas lainnya. Dengan memahami konsep pewarisan, Anda dapat merancang struktur kelas yang lebih fleksibel dan mudah dipelihara dalam aplikasi Java Anda.
