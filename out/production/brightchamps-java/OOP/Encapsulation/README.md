# **Pengenalan Encapsulation dalam Java**

---

**1. Apa itu Encapsulation?**

Encapsulation adalah salah satu prinsip utama dalam pemrograman berorientasi objek (OOP) yang menggabungkan data dan metode yang beroperasi pada data ke dalam sebuah unit tunggal yang disebut sebagai kelas. Prinsip ini membantu dalam menyembunyikan detail implementasi dan melindungi data dari akses langsung.

**2. Tujuan Encapsulation:**

- Melindungi data dari modifikasi yang tidak disengaja.
- Meningkatkan keamanan aplikasi dengan menyembunyikan detail implementasi.
- Mempermudah pengelolaan kode dengan menyediakan antarmuka yang terstruktur.

**3. Konsep-konsep Kunci:**

- **Variabel Instance Private**: Data yang terkait dengan sebuah objek disimpan sebagai variabel instance private, yang tidak dapat diakses secara langsung dari luar kelas.
  
- **Metode Publik**: Metode-metode publik digunakan untuk mengakses dan memanipulasi data yang disembunyikan. Ini memungkinkan untuk menerapkan logika bisnis dan validasi data sebelum mengakses atau mengubahnya.

**4. Manfaat Encapsulation:**

- **Keamanan Data**: Data dienkapsulasi dalam kelas, sehingga hanya metode-metode yang ditentukan yang dapat mengakses atau memanipulasi data tersebut.
  
- **Fleksibilitas**: Implementasi internal kelas dapat berubah tanpa mempengaruhi klien eksternal yang menggunakan kelas tersebut.
  
- **Pengelolaan Kode yang Lebih Baik**: Dengan membatasi akses langsung ke data, perubahan internal kelas dapat dikelola lebih mudah.

## **Proyek Sederhana: Sistem Manajemen Pegawai**

---

**Deskripsi Proyek:**

Kita akan membuat sistem sederhana untuk manajemen pegawai dengan menggunakan prinsip Encapsulation. Setiap pegawai memiliki nama, gaji, dan ID pegawai. Kita akan menggunakan kelas untuk merepresentasikan pegawai dan menerapkan encapsulation untuk menyembunyikan detail implementasi.

**Implementasi:**

[*Sistem managament pegawai*](EmployeeManagementSystem.java)

**Penjelasan:**

- Dalam kelas `Employee`, variabel instance `name`, `salary`, dan `employeeId` dideklarasikan sebagai private untuk menerapkan encapsulation.
  
- Metode-metode publik seperti `getName()`, `setName()`, `getSalary()`, `setSalary()`, dan `getEmployeeId()` digunakan untuk mengakses dan memanipulasi data yang disembunyikan.
  
- Kita menggunakan konstruktor untuk inisialisasi objek saat pembuatan instance.

**Kesimpulan:**

Dalam proyek ini, kita telah menerapkan prinsip Encapsulation dalam pembuatan sistem manajemen pegawai. Dengan membatasi akses langsung ke data dan menyediakan metode publik untuk mengakses dan memanipulasi data, kita dapat menciptakan kode yang lebih aman, fleksibel, dan mudah dimengerti. Prinsip ini adalah salah satu fondasi penting dari pemrograman berorientasi objek dalam Java.

---

## Access Modifiers: Public, Protected, Default, Private

Four accessibility keywords (access modifiers) that can be used to control access to attributes, methods, and classes in a program. These keywords allow limited access to members of a class by classes that are in the same package or by subclasses, either in the same package or in different packages.

| Modifier | Class | Package | Subclass | Global |
|   --  |   --  |   --  |   --  |   --  |
| Public | ✔ | ✔ | ✔ | ✔ |
| Protected | ✔ | ✔ | ✔ | ✖ |
| Default | ✔ | ✔ | ✖ | ✖ |
| Private | ✔ | ✖ | ✖ | ✖ |

- `Public:` As the name implies, this modifiers allows every methods and data field in a class to be accessible from any package or class as long as an instance(object) of the class has been created. That may sound like gibberish, but let us grind some of the big jargon down.

- `Class`: This is a blueprint of objects to be created, it defines the data and methods that will be needed by an object both for its initialization and manipulation. Let us be a bit more realistic using a real life example, it is the design of a house created on a piece of paper, from this single design, different units of houses can be built.

- `Objects`: This is also known as an instance. Like every real world object, they have state and behaviors which are defined while creating the template(class). Note that this states and behaviors can be modified (depending on the access specifier)

- `Private`: Every data field or method declared with this access specifier can only be accessed by objects of the class it was created. Don’t worry, I will show an example of this specifiers, and hopefully, you appreciate them more.

- `Protected`: If a mum wants to mark a bag of orange, so her children can access it no matter where they find the bag of orange(be it Lagos or Owerri) they have access to it. She marks it as “protected”. In Java lingo, a child of a Class is called a “subclass”. No matter where the subclasses were created, be it in the same package or otherwise, they will be able to access any data field or method marked protected, while other objects can not.

- `Default`: Anytime a programmer fails to define a visibility modifier, Java automatically sets it to default. And the implication of this is that only objects of the class which contains the default variable, defined in the same package can access all the properties and methods ‘marked’ default in the class.
