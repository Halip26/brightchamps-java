package OOP.Polymorphism;

import java.util.Scanner;

// Abstract class for temperature conversion
abstract class TemperatureConverter {
  abstract double convert(double temperature);
}

// Concrete subclass for Celsius to Fahrenheit conversion
class CelsiusToFahrenheitConverter extends TemperatureConverter {
  public double convert(double temperature) {
    return (temperature * 9 / 5) + 32;
  }
}

// Concrete subclass for Celcius Kelvin conversion
class CelciustoKelvinConverter extends TemperatureConverter {
  public double convert(double temperature) {
    return (temperature + 273.15);
  }
}

// Concrete subclass for Fahrenheit to Celsius conversion
class FahrenheitToCelsiusConverter extends TemperatureConverter {
  public double convert(double temperature) {
    return (temperature - 32) * 5 / 9;
  }
}

// Concrete subclass for Fahrenheit to Kelvin conversion
class FahrenheitToKelvinConverter extends TemperatureConverter {
  public double convert(double temperature) {
    return (temperature - 32) * 5 / 9 + 273.15;
  }
}

// Concrete subclass for Kelvin to Fahrenheit conversion
class KelvinToFahrenheitConverter extends TemperatureConverter {
  public double convert(double temperature) {
    return (temperature - 273.15) * 9 / 5 + 32;
  }
}

// Concrete subclass for Kelvin to Celcius conversion
class KelvintoCelciusConverter extends TemperatureConverter {
  public double convert(double temperature) {
    return (temperature - 273.15);
  }
}

public class TemperatureConverterMain {
  private static Scanner scanner;

  public static void main(String[] args) {
    scanner = new Scanner(System.in);

    System.out.println("Welcome to the temperature converter");
    while (true) {

      // Create lines
      for (int i = 0; i <= 35; i++) {
        System.out.print("-");
      }
      System.out.println();

      System.out.println("1. Celsius to Fahrenheit");
      System.out.println("2. Celsius to Kelvin");
      System.out.println("3. Fahrenheit to Celsius");
      System.out.println("4. Fahrenheit to Kelvin");
      System.out.println("5. Kelvin to Fahrenheit");
      System.out.println("6. Kelvin to Celsius");
      System.out.println("7. Quit/Exit");

      // Create lines
      for (int i = 0; i <= 35; i++) {
        System.out.print("-");
      }
      System.out.println();

      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();

      TemperatureConverter converter;
      if (choice == 1) {
        converter = new CelsiusToFahrenheitConverter();
      } else if (choice == 2) {
        converter = new CelciustoKelvinConverter();
      } else if (choice == 3) {
        converter = new FahrenheitToCelsiusConverter();
      } else if (choice == 4) {
        converter = new FahrenheitToKelvinConverter();
      } else if (choice == 5) {
        converter = new KelvinToFahrenheitConverter();
      } else if (choice == 6) {
        converter = new KelvintoCelciusConverter();
      } else if (choice == 7) {
        System.out.println("You have exited the program");
        break;
      } else {
        System.out.println("Invalid choice");
        return;
      }

      System.out.print("Enter temperature: ");
      double temperature = scanner.nextDouble();

      double convertedTemperature = converter.convert(temperature);
      System.out.println("Converted temperature: " + convertedTemperature);
    }

  }

}
