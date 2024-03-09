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
