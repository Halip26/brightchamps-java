package Multithreading;

import java.util.Random;
import java.util.Scanner;

class Vault {
  private static final int MIN_PIN = 100;
  private static final int MAX_PIN = 999;
  private int[] pins;

  public Vault() {
    pins = new int[2];
    generatePins();
  }

  private void generatePins() {
    Random random = new Random();
    for (int i = 0; i < pins.length; i++) {
      pins[i] = random.nextInt(MAX_PIN - MIN_PIN + 1) + MIN_PIN; // Ensure 3-digit pins
    }
  }

  public int getPin(int index) {
    if (index >= 0 && index < pins.length) {
      return pins[index];
    } else {
      throw new IllegalArgumentException("Invalid pin index: " + index);
    }
  }

  public void printPins() {
    System.out.println("PIN to open the PPT file is: " + pins[0]);
    System.out.println("PIN to open the Video File : " + pins[1]);
  }
}

class File {
  private final String filename;

  public File(String filename) {
    this.filename = filename;
  }

  public String getFilename() {
    return filename;
  }

  public boolean validatePin(Vault vault, int pinIndex, int userEnteredPin) {
    return vault.getPin(pinIndex) == userEnteredPin;
  }

  public void displayContents(String message) {
    System.out.println("Contents of opened File: " + filename + "\n" + message);
  }
}

class PPTFile extends File implements Runnable {

  public PPTFile(String filename) {
    super(filename);
  }

  @Override
  public void run() {
    try (Scanner scanner = new Scanner(System.in)) {
      Vault vault = new Vault();
      vault.printPins(); // Show pins before waiting

      System.out.print("Enter the pin to open PPT file: ");
      int userEnteredPin = scanner.nextInt();

      if (validatePin(vault, 0, userEnteredPin)) {
        System.out.println("Opening " + getFilename());
        displayContents("Have a good day...Enjoy Coding");
      } else {
        System.out.println("Wrong PIN " + userEnteredPin + " Cannot Read the file " + getFilename());
      }
    } catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
    }
  }
}

class VideoFile extends File implements Runnable {

  public VideoFile(String filename) {
    super(filename);
  }

  @Override
  public void run() {
    try (Scanner scanner = new Scanner(System.in)) {
      Vault vault = new Vault();
      vault.printPins(); // Show pins before waiting

      System.out.print("Enter the pin to open Video file: ");
      int userEnteredPin = scanner.nextInt();

      if (validatePin(vault, 1, userEnteredPin)) {
        System.out.println("Opening Video File " + getFilename());
        displayContents("Welcome to lecture video of Coding");
      } else {
        System.out.println("Wrong PIN " + userEnteredPin + " Cannot Read the file " + getFilename());
      }
    } catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
    }
  }
}

public class Multithreading {

  public static void main(String[] args) {
    Thread pptThread = new Thread(new PPTFile("file1"));
    Thread videoThread = new Thread(new VideoFile("Lecture"));

    pptThread.start();
    videoThread.start();

    try {
      pptThread.join();
      videoThread.join();
    } catch (InterruptedException e) {
      System.err.println("Error joining threads: " + e.getMessage());
    }

    System.out.println("Closing all files");
  }
}
