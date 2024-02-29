package OOP.Polymorphism;

import java.util.Scanner;

class calculateBMI {
  // Method to calculate BMI for weight in kilograms and height in centimeters
  public double calculateBMIinCm(double weight, double height) {
    return weight / ((height / 100) * (height / 100));
  }

  // Method overloading to calculate BMI for weight in pounds and height in inches
  public double WeightHeight(double weightPounds, double heightInches) {
    final double KILOGRAMS_PER_POUND = 0.45359237;
    final double METERS_PER_INCH = 0.0254;
    double weightKg = weightPounds * KILOGRAMS_PER_POUND;
    double heightM = heightInches * METERS_PER_INCH;
    return weightKg / (heightM * heightM);
  }
}

public class BMIcalculator {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Masukkan berat badan (kg): ");
      double weight = sc.nextDouble();
      System.out.print("Masukkan tinggi badan (cm): ");
      double height = sc.nextDouble();

      calculateBMI BMI = new calculateBMI();

      double bmi = BMI.calculateBMIinCm(weight, height); // Call the appropriate calculateBMIinCm method

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
