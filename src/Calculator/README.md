# Fungsi `void`

Fungsi `void` digunakan ketika Anda ingin mendefinisikan sebuah method yang tidak mengembalikan nilai (tidak mengembalikan nilai balik). Ini berarti method tersebut hanya melakukan tindakan atau operasi tertentu tanpa memberikan nilai balik ke pemanggil.

Contoh penggunaan method dengan tipe `void` adalah ketika Anda ingin melakukan tindakan seperti mencetak sesuatu ke konsol, memperbarui nilai dari objek atau variabel di dalam method itu sendiri, atau melakukan operasi I/O tanpa memerlukan nilai balik.

Berikut adalah contoh implementasi dari metode `performOperation` dengan tipe `void`, di mana metode tersebut hanya melakukan operasi matematika tanpa mengembalikan nilai:

```java
public static void performOperation(int a, int b, String operation) {
    switch (operation) {
        case "addition":
            System.out.println("Result of addition: " + (a + b));
            break;
        case "subtraction":
            System.out.println("Result of subtraction: " + (a - b));
            break;
        case "multiplication":
            System.out.println("Result of multiplication: " + (a * b));
            break;
        case "division":
            System.out.println("Result of division: " + (a / b));
            break;
        default:
            System.out.println("Invalid operation");
    }
}
```

Dalam contoh ini, `performOperation` menerima dua bilangan bulat `a` dan `b`, serta string `operation` yang menentukan operasi matematika yang akan dilakukan. Method ini kemudian melakukan operasi tersebut dan mencetak hasilnya ke konsol tanpa mengembalikan nilai balik.
