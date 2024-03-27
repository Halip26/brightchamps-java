import java.util.Scanner; // mengimport scanner yang digunakan untuk meminta input dari user

public class BMIcalculator { // nama class
    public static void main(String[] args) { // method utama
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Masukkan berat badan (kg): "); // output kalimat untuk meminta input berat badan
            double weight = sc.nextDouble(); // mengambil input berat badan dari user
            System.out.print("Masukkan tinggi badan (cm): "); // output kalimat untuk meminta input tinggi badan
            double height = sc.nextDouble(); // mengambil input tinggi badan dari user
            double bmi = weight / (height * height); // menghitung BMI

            // menampilkan hasil perhitungan BMI dalam If statement
            if (bmi < 15.0) {
                System.out.println("BMI Anda sangat kurus");
            } else if (bmi >= 15.0 && bmi < 16.0) {
                System.out.println("BMI Anda kurus");
            } else if (bmi >= 16.0 && bmi < 18.5) {
                System.out.println("BMI Anda sedang");
            } else if (bmi >= 18.5 && bmi < 25.0) {
                System.out.println("BMI Anda normal (ideal)");
            } else if (bmi >= 25.0 && bmi < 30.0) {
                System.out.println("BMI Anda berat");
            } else {
                System.out.println("BMI Anda sangat berat (obesitas)");
            }
        }
    }
}
