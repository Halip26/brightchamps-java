import java.util.Scanner; // mengimport scanner yang digunakan untuk meminta input dari user

public class BMIcalculator {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.print("\nMasukkan berat badan (kg): ");
        double weight = scan.nextDouble();
        System.out.print("Masukkan tinggi badan (cm): ");
        double height = scan.nextDouble();

        double bmi = weight / ((height * height) / 10000);

        // create lines using looping for
        for (int i = 0; i <= 35; i++) {
            System.out.print("-");
        }
        System.out.println();

        System.out.printf("BMI anda adalah: %.2f - ", bmi);

        // show the results
        if (bmi < 15.0) {
            System.out.println("Anda sangat kurus (Very uderweight)");
        } else if (bmi >= 15.0 && bmi < 16.0) {
            System.out.println("Anda kurus (Uderweight)");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Anda normal (Ideal)");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Anda berat (Overweight)");
        } else {
            System.out.println("Anda sangat berat (Obese)");
        }

    }
}
